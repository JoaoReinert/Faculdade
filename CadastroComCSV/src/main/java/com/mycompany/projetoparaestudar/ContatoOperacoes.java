/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projetoparaestudar;

import java.util.List;

/**
 *
 * @author joao3
 */
public interface ContatoOperacoes {
    
    void adicionarContato(Contato contato);
    List<Contato> listarContatos();
    boolean excluirContato(String id);
    void salvarContatos(List<Contato> contato);
}
