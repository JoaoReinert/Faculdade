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
public class CartaoFidelidade extends Cartao{

    public CartaoFidelidade(double saldo) {
        super(saldo);
    }
    
    

    @Override
    public double calcularDesconto(Pedido pedido){
        
        ArrayList<Prato> pratosTotais = pedido.getPratos();
        double precoSobremesa = 0;
        
        for (int i = 0; i < pratosTotais.size(); i++) {
            Prato prato = pratosTotais.get(i);
            if (prato.getCategoria() == Categoria.SOBREMESA) {
                precoSobremesa = prato.getValor();
                break;
            } 
        } if (precoSobremesa != 0) {
            return precoSobremesa;
        } else {
            return pedido.calcularValorPedido() * 0.3;
        }
        
    }
    
}
