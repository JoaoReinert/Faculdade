/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author joao3
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero1, numero2, titular1, titular2;
        
        System.out.println("informe o numero da conta 1");
        numero1 = scanner.next();
        
        System.out.println("informe o titular da conta 1");
        titular1 = scanner.next();
        
        ContaBancaria c1 = new ContaBancaria();
        c1.setTitular(titular1);
        c1.setNumero(numero1);
        
        System.out.println("informe o numero da conta 2");
        numero2 = scanner.next();
        
        System.out.println("informe o titular da conta 2");
        titular2 = scanner.next();
        
        ContaBancaria c2 = new ContaBancaria();
        c2.setTitular(titular2);
        c2.setNumero(numero2);
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        
        c2.sacar(3000);
        
        c2.transferir(c1, 800);
        
        
    }
    
}
