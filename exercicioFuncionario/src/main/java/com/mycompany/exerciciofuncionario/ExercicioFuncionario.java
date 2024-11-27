/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofuncionario;

import javax.swing.JOptionPane;

/**
 *
 * @author joao3
 */
public class ExercicioFuncionario {

    public static void main(String[] args) {
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a altura"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o comprimentro"));
        
        Retangulo r1 = new Retangulo();
        
        try {
            r1.setAltura(altura);
            r1.setComprimento(comprimento);
            double area = r1.calcularArea();
            double perimetro = r1.calcularPerimetro();
        
            JOptionPane.showMessageDialog(null, "area é " + area);
            JOptionPane.showMessageDialog(null, "perimetro é " + perimetro);
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
      
    }
}
