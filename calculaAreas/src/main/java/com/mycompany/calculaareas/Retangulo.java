/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculaareas;

/**
 *
 * @author joao3
 */
public class Retangulo extends Figura{
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
        
    @Override
    public double calculaArea() {
        return altura * largura;
    }
}
