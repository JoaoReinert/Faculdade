/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author joao3
 */
public class Empresa {

    public static void main(String[] args) {
        Funcionario funcionario;
        funcionario = new Programadores();
        Programadores programadores;
        programadores = new Programadores();
        funcionario.nome = "JULIO";
        funcionario.salarioBase = 1000;
        // funcionario linguegem erro
        programadores.linguegemConhecidas = "java";
        System.out.println(funcionario.nome);
        System.out.println(funcionario.salarioBase);
        System.out.println(programadores.linguegemConhecidas);
    }
}
