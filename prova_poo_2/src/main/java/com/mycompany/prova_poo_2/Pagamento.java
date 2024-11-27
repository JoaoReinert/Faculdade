/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_poo_2;

/**
 *
 * @author joao3
 */
public class Pagamento {
    
    private Pedido pedido;
    private MetodoPagamento metodo;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("valor incorreto");
        }
        this.pedido = pedido;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPagamento metodo) {
        if (metodo == null) {
            throw new IllegalArgumentException("metodo invalido");
        }
        this.metodo = metodo;
    }
    
    
    
    public Pagamento(Pedido pedido, MetodoPagamento metodo){
        setPedido(pedido);
        setMetodo(metodo);
    }
    
    public double calcularTotalPagar(){
        double valor = pedido.calcularValorPedido();
        double desconto = metodo.calcularDesconto(pedido);
        
        return valor - desconto;
    }
}
