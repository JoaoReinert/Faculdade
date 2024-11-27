/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculaareas;

/**
 *
 * @author joao3
 */
public class Circulo extends Figura{
    private int raio;
    
    public Circulo(int raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        int raio2 = raio * raio;
        return 3.14 * raio2;
    }
}
