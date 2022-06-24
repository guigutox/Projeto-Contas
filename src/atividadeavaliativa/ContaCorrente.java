/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class ContaCorrente extends Conta {
    
    private float limite;
    private boolean emprestimo;
    
    public ContaCorrente(int idade, float saldo, String nome){
        
        super(idade,saldo,nome);
        this.limite = (2*saldo);
        this.emprestimo = true;

    }
    
    @Override
    public void showAll(){
        
            System.out.println("Id: "+super.getId());
            System.out.println("Nome: "+super.getNome());
            System.out.println("Idade: "+super.getIdade());
            System.out.println("Saldo: R$"+super.getSaldo());
    }
    
    @Override
    public void sacar(float x){
        if(super.getSaldo() >= x){
        super.setSaldo(super.getSaldo() - x);
        System.out.println("Saldo atual: R$"+super.getSaldo());
        
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    
    
    public void verificarLimite(){
        Scanner read = new Scanner(System.in);
        System.out.println("O limite atual e: "+this.limite);
        System.out.println("Deseja requisitar aumento de limite? 1-sim 2- nao");
        int op = read.nextInt();
        if(op == 1){
            if(super.getSaldo()>=limite){
                System.out.println("Aumento de limite aprovado, seu limite foi dobrado!");
                limite = limite*2;
            }
            else{
                System.out.println("Limite reprovado, seu limite e maior que seu saldo!");
            }   
        }
        
        
        
    }
    public void pedirEmprestimo(){
      
        this.emprestimo = super.getSaldo()>0;
        if(this.emprestimo){
            System.out.println("Voce cumpre os requisitos para pedir um emprestimo");
        }
        else{
            System.out.println("Voce nao cumpre os requsistos para realizar o emprestimo!");
        }   
    }
    
    @Override
    public void depositar(float x){
        super.setSaldo(x+super.getSaldo());
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo atual: R$"+super.getSaldo());
        
        
    }


    
}
