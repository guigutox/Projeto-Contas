/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa;

/**
 *
 * @author guilh
 */
public class ContaPoupanca extends Conta {

    private float rendimento = 0;
    private float tarifaDeSaque = 0;

    public ContaPoupanca(int idade, float saldo, String nome) {

        super(idade, saldo, nome);

        this.rendimento = ((super.getSaldo() / 100) * 10);
        this.tarifaDeSaque = ((super.getSaldo() / 100) * 1);

    }

    @Override
    public void showAll() {

        System.out.println("Id: " + super.getId());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Saldo: R$" + super.getSaldo());

    }

    @Override
    public void sacar(float x) {
        if (super.getSaldo() >= x) {
            this.tarifaDeSaque = (float) (x * 0.05);
            super.setSaldo((super.getSaldo() - x)-this.tarifaDeSaque  );
            
            System.out.println("Uma taxa de 5% no valor o saque sera cobrado");
            System.out.println("Taxa: R$"+this.tarifaDeSaque);
            System.out.println("Saldo atual: R$" + super.getSaldo());

        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void verificarRendimento() {
        this.rendimento = ((super.getSaldo() / 100) * 10);
        System.out.println("Seu rendimento mensal equivale a 10% do dinheiro guardado");
        System.out.println("Seu redimento e de: " + this.rendimento);
    }

    @Override
    public void depositar(float x) {
        super.setSaldo(x + super.getSaldo());
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo atual: R$" + super.getSaldo());

    }

}
