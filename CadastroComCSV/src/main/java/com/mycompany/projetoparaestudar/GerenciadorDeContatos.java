/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoparaestudar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao3
 */
public class GerenciadorDeContatos implements ContatoOperacoes {

    private final String caminhoArquivo = "contatos.csv";

    @Override
    public void adicionarContato(Contato contato) {
        // abre o arquivo com o writer e a funcao append é passada como true para add sem substituir as coisas que tao la dentro ja
        // file writer abre o arquivo no modo escrita e o buffered escreve no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            // escreve os dados passados como no metodo to string que eu passei na classe contato
            writer.write(contato.toString());
            // adiciona uma nova linha apos add um contato novo
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar contato: " + e.getMessage());
        }
    }

    @Override
    public List<Contato> listarContatos() {
        List<Contato> contatos = new ArrayList<>();
        // abre o arquivo csv em modo leitura o reader 
        // buffered le o texto do arquivo e o file abre em modo leitura
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            // le cada linha que representa um contato
            // read line final da linha
            while ((linha = reader.readLine()) != null) {
                // divide a linha em partes 
                String[] dados = linha.split(",");
                // verifica se a linha ta separada exatamente certa em 3 partes dai ele cria um objeto pra essa linha e add na lista
                if (dados.length == 3) {
                    contatos.add(new Contato(dados[0], dados[1], dados[2]));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler contatos: " + e.getMessage());
        }
        return contatos;
    }

    @Override
    public boolean excluirContato(String id) {
        List<Contato> contatos = listarContatos();
        boolean removido = contatos.removeIf(
                contato
                -> contato.getName().equalsIgnoreCase(id)
                || contato.getTelefone().equalsIgnoreCase(id)
                || contato.getEmail().equalsIgnoreCase(id)
        );

        if (removido) {
            salvarContatos(contatos);
        }
        return removido;
    }
    
    @Override
    public void salvarContatos(List<Contato> contatos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contatos.csv"))) {
            for (Contato contato : contatos) {
                writer.write(contato.getName() + "," + contato.getTelefone() + "," + contato.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
