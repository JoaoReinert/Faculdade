/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciofuncionario;

/**
 *
 * @author joao3
 */
public class Retangulo {
    
    private int altura;
    private int comprimento;
    
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    public Retangulo() {}

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws IllegalArgumentException {
        if (altura <= 0) {
            throw new IllegalArgumentException("altura valor "+ altura + " é invalido");
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) throws IllegalArgumentException {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("comprimento valor "+ comprimento + " é invalido");
        }
        this.comprimento = comprimento;
    }
    
    public int calcularArea() {
        return comprimento * altura;
    }
    
    public int calcularPerimetro() {
        return (altura * 2) + (comprimento * 2);
    }
    
}
