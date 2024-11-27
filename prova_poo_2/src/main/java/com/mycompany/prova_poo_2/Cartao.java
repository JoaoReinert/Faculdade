/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_poo_2;

/**
 *
 * @author joao3
 */
public class Cartao implements MetodoPagamento{
    
    private double saldo; 
    
    public Cartao(double saldo){
        if (saldo <= 0) {
            throw new IllegalArgumentException("Valor para o campo saldo está incorreto");
        }
        this.saldo = saldo;
    }

    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.calcularValorPedido() * 0.05; 
    }

    @Override
    public double calcularTroco(double valorPedido) {
        return 0.0; 
    }
    
}
