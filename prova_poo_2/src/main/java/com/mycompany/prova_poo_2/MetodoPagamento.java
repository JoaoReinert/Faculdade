/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prova_poo_2;

/**
 *
 * @author joao3
 */
public interface MetodoPagamento {
    
    double calcularDesconto(Pedido pedido);
    double calcularTroco(double valorPedido); 
}
