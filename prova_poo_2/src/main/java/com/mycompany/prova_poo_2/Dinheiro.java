/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_poo_2;

/**
 *
 * @author joao3
 */
public class Dinheiro implements MetodoPagamento{
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor invalido");
        }
        this.valor = valor;
    }
    
    public Dinheiro(double valor){
        setValor(valor);
    }

    @Override
    public double calcularDesconto(Pedido pedido) {
        double valorPedido = pedido.calcularValorPedido();
        return valorPedido * 0.1;
         
    }

    @Override
    public double calcularTroco(double valorPedido) {
        double trocoFinal = valor - valorPedido;
        return trocoFinal;
    }


    
}
