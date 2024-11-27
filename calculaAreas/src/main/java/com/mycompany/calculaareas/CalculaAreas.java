/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculaareas;

import java.util.Scanner;

/**
 *
 * @author joao3
 */
public class CalculaAreas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o nome da figura que vc deseja saber a medida");
        String tipoFigura = scan.next().toLowerCase();
        
        Figura figura = null;
        
        switch(tipoFigura){
            case "retangulo": 
                System.out.println("digite a largura");
                int largura = scan.nextInt();
                System.out.println("digite a altura");
                int altura = scan.nextInt();
                figura = new Retangulo(largura, altura);
                break;
                
            case "circulo":
                System.out.println("digite o raio");
                int raio = scan.nextInt();
                figura = new Circulo(raio);
                break;
            
            case "triangulo":
                System.out.println("digite o lado A");
                int ladoA = scan.nextInt();
                System.out.println("digite o lado B");
                int ladoB = scan.nextInt();
                System.out.println("digite o lado C");
                int ladoC = scan.nextInt();
                figura = new Triangulo(ladoA, ladoB, ladoC);
                break;
            
            default:
                System.out.println("figura desconhecida");
                break;
                
        }
        
        if (figura != null) {
            System.out.println("a área da figura é: " + figura.calculaArea());
        }
    }
}
