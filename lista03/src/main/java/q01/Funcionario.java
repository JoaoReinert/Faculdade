package q01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao3
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if (nome == null || nome.isBlank() || nome.trim().isEmpty()) {
           throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
           throw new IllegalArgumentException("salario invalido");
        }
        this.salario = salario;
    }
    
    
}
