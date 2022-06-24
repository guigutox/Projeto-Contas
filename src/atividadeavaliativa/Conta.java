/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa;
import java.util.Random;
/**
 *
 * @author guilh
 */


public abstract class Conta {
    public static Random randomico = new Random();
    
    private int id;
    private float saldo;
    private String nome;
    private int idade;
    public Conta(int idade, float saldo, String nome){
        
        
        this.id = randomico.nextInt(1000);
        this.idade = idade;
        this.saldo = saldo;
        this.nome = nome;
        
    }
    

    protected abstract void sacar(float x);
    protected abstract void showAll();
    protected abstract void depositar(float x);
    
    protected int getId(){
        return this.id;
    }
    protected float getSaldo(){
        return this.saldo;
    }
    protected String getNome(){
        return this.nome;
    }
    protected int getIdade(){
        return this.idade;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
