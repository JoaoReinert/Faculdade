/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao3
 */
public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;
    
    public void setNumero(String numero) {
        
        if (numero == null || numero.isBlank()) {
           throw new IllegalArgumentException("numero conta invalido");
        }
        this.numero = numero;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setTitular (String titular) {
    if (titular == null || titular.isBlank()){
    throw new IllegalArgumentException("numero nao sei oq");
    }
    this.titular = titular;
    }
    
    public String getTitular() {
    return this.titular;
    }
    
    public double getSaldo() {
    return saldo;
    }
    
    public void depositar (double valor) {
    if (valor <= 0) {
        throw new IllegalArgumentException("valor invalido");
    }
    this.saldo = this.saldo + valor;
 }
    
    public void sacar (double valor) {
    if (this.saldo < valor) {
    throw new IllegalArgumentException("saldo invalido");
    }
    if (valor <= 0) {
    throw new IllegalArgumentException("saque errado");
    }
    this.saldo -= valor;
    }
    
    public void transferir (ContaBancaria contaDestino, double valor) {
    if (contaDestino == null) {
    throw new IllegalArgumentException("conta inexistente");
    }
    this.sacar(valor);
    contaDestino.depositar(valor);
    }
}
