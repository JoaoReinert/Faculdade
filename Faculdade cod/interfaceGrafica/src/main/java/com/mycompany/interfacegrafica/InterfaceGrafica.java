/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacegrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author joao3
 */
public class InterfaceGrafica {
    
    static int qntContas = 0;
    static ContaBancaria[] contas = new ContaBancaria[10];

    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "erro carai", "Mensagem de erro carai", JOptionPane.ERROR_MESSAGE);
        
        //String texto = JOptionPane.showInputDialog(null, "informe seu alguma coisa");
        //JOptionPane.showMessageDialog(null, texto);

        int comando;
        boolean executar = true;
 
        do {
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n 1 - cadastrar \n 2 - sacar \n 3 - depositar \n 4 - sair")); 
            switch  (comando) {
                case 1 -> criarConta();
                case 2 -> sacar();
                    
                case 3 -> depositar();
                case 4 -> executar = false;
                default -> JOptionPane.showMessageDialog(null, "Comando inválido");
            }
            
        } while (executar);
    }

    public static ContaBancaria buscar(String numero) {
        if (qntContas == 0) {
            return null;
        }
        for (ContaBancaria cb: contas) {
            if (cb.getNumero().equals(numero)) {
                return cb;
            }
        }
        return null;
    }
    
    public static void criarConta () {
        String titular = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada != null){
             JOptionPane.showMessageDialog(null, "Conta ja cadastrada");
             return;
        }
        selecionada = new ContaBancaria();
        selecionada.setNumero(numero);
        selecionada.setTitular(titular);
        contas[qntContas] = selecionada;
        qntContas++;
    }
    
    public static void sacar () {
        
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null){
             JOptionPane.showMessageDialog(null, "Conta nao existe");
             return;
        }
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do saque"));
        try {
            selecionada.sacar(valor);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        selecionada.sacar(valor);
        JOptionPane.showMessageDialog(null, "O saldo atual é: " + selecionada.getSaldo());
    }
    
    public static void depositar () {
    
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null){
             JOptionPane.showMessageDialog(null, "Conta nao existe");
             return;
        }
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do deposito"));
        selecionada.depositar(valor);
        JOptionPane.showMessageDialog(null, "O saldo atual é: " + selecionada.getSaldo());
    }
}
