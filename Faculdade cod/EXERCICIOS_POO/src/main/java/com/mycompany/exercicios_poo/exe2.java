/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_poo;

import java.util.Scanner;

/**
 *
 * @author joao3
 */

public class exe2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a altura da pessoa: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Informe o peso da pessoa: ");
        double peso = scanner.nextDouble();
        
        Pessoa pessoa;
        pessoa = new Pessoa();
        
        pessoa.altura = altura;
        pessoa.peso = peso;
        
        System.out.println("O IMC da pessoa é: " + pessoa.calcularIMC());
    }
}
