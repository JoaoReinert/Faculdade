/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provapoo2;

/**
 *
 * @author joao3
 */
public class ProvaPOO2 {

    public static void main(String[] args) {
        Carro golzin = new GolzinVermeioDeBandido();
        Carro jetta = new JettaBrancoDeBandido();
        
        coisas(golzin);
        coisas(jetta);
        
    }
    
    public static void coisas(Carro carro) {
        carro.acelerar();
        carro.frear();
    } 
}
