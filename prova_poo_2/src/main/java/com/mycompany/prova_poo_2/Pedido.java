/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_poo_2;

import java.util.ArrayList;

/**
 *
 * @author joao3
 */
public class Pedido {
    
    private ArrayList<Prato> pratos = new ArrayList<>();
    
    public double calcularValorPedido(){
        double valor = 0;
        
        for (Prato prato : pratos) {
            valor += prato.getValor();
        }
        return valor;
    }
    
    public void incluirPrato(Prato prato){
        if (prato == null) {
            throw new IllegalArgumentException("prato incorreto");
        }
        pratos.add(prato);
    }
    
    public void removerPrato(){
        pratos.clear();
    }
    
    
    
    public ArrayList<Prato> getPratos() {
        return pratos;
    }
}
