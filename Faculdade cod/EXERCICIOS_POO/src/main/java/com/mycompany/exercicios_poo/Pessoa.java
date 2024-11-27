/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_poo;

/**
 *
 * @author joao3
 */
public class Pessoa {
    public double altura;
    public double peso;
    
    public double calcularIMC () {
        double imc = peso / altura * altura;
        
        return imc;
    };
}
