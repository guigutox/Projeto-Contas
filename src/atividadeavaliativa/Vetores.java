package atividadeavaliativa;

import java.util.Scanner;
import java.util.Random;

public class Vetores {

    private ContaPoupanca contaP[] = new ContaPoupanca[10];
    private ContaCorrente contaC[] = new ContaCorrente[10];

    private int contadorP = 0, contadorC = 0;

    public void cadastrarPoupanca() {

        Scanner read = new Scanner(System.in);
        Random gerador = new Random();

        int idade;
        float saldo;
        String nome;
        if (contadorP < contaP.length) {
            System.out.println("NOVO REGISTRO");
            System.out.println("Digite sua idade: ");
            idade = read.nextInt();
            while (idade < 12) {
                System.out.println("Menores de 12 anos nao podem criar uma poupanca, digite a idade novamente!");
                idade = read.nextInt();
            }
            saldo = gerador.nextFloat(1000);

            System.out.println("Digite seu nome: ");
            read.nextLine();
            nome = read.nextLine();

            contaP[contadorP] = new ContaPoupanca(idade, saldo, nome);

            System.out.println("Dados: \n" + "id:" + contaP[contadorP].getId() + "\nidade: " + idade + "\nsaldo: " + saldo + "\nNome: " + nome + "\nContador: " + contadorP);
            contadorP++;

        } else {
            System.out.println("Numero maximo de cadastros de poupanca alcançado");
            return;
        }

    }

    public int searchByIdP(int x) {
        for (int i = 0; i < contaP.length; i++) {

            if (contaP[i] != null && contaP[i].getId() == x) {
                return i;
            }

        }
        return -1;

    }

    public void searchReg() {

        Scanner read = new Scanner(System.in);
        System.out.println("Qual o id para busca? ");

        int x = read.nextInt();
        int resultado = this.searchByIdP(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta poupanca encontrada!");
            contaP[resultado].showAll();
        } else {
            System.out.println("Conta poupanca nao encontrada!");
            return;
        }

    }

    public void verificaRendimento() {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual o id para busca? ");

        int x = read.nextInt();
        int resultado = this.searchByIdP(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta poupanca encontrada!");

            contaP[resultado].verificarRendimento();
        }

    }

    public void sacarpoupanca() {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual o id para busca? ");

        int x = read.nextInt();
        int resultado = this.searchByIdP(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta poupanca encontrada!");
            System.out.println("Quanto deseja sacar?");
            float saque = read.nextFloat();
            while (saque < 0) {
                System.out.println("Quantia invalida! ");
                System.out.println("Quanto deseja sacar?");
                saque = read.nextFloat();
            }

            contaP[resultado].sacar(saque);
        }

    }

    public void depositarP() {

        Scanner read = new Scanner(System.in);
        float valor;
        System.out.println("Digite o id da conta a depositar: ");
        int x = read.nextInt();
        int resultado = this.searchByIdP(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta poupanca encontrada!");
            System.out.println("Quanto deseja depositar? ");
            valor = read.nextInt();
            while (valor < 1) {
                System.out.println("Quantia invalida! ");
                System.out.println("Quanto deseja depositar?");
                valor = read.nextInt();
            }
            contaP[resultado].depositar(valor);
        } else {
            System.out.println("Conta nao encontrada");
        }

    }

    //CONTA CORRENTE 
    public void cadastrarCorrente() {

        Scanner read = new Scanner(System.in);
        Random gerador = new Random();

        int idade;
        float saldo;
        String nome;

        if (contadorC < contaC.length) {

            System.out.println("NOVO REGISTRO!!");
            System.out.println("Digite sua idade: ");
            idade = read.nextInt();
            while (idade < 18) {
                System.out.println("Menores de 18 ano nao podem ter conta corrente, digite a idade novamente!");
                idade = read.nextInt();
            }
            saldo = gerador.nextFloat(1000);

            System.out.println("Digite seu nome: ");
            read.nextLine();
            nome = read.nextLine();

            contaC[contadorC] = new ContaCorrente(idade, saldo, nome);

            System.out.println("Dados: \n" + "id:" + contaC[contadorC].getId() + "\nidade: " + idade + "\nsaldo: " + saldo + "\nNome: " + nome + "\nContador: " + contadorC);

            contadorC++;

        } else {
            System.out.println("Numero maximo de cadastros de contas correntes alcançado");
            return;
        }
    }

    public int searchByIdC(int x) {
        for (int i = 0; i < contaC.length; i++) {

            if (contaC[i] != null && contaC[i].getId() == x) {
                return i;
            }

        }
        return -1;

    }

    public void verificarLimite() {
        Scanner read = new Scanner(System.in);
        int id, retorno;
        System.out.println("Digite o id da conta corrente a ser consultada!");
        id = read.nextInt();
        retorno = this.searchByIdC(id);
        if (retorno != -1) {
            contaC[retorno].verificarLimite();
        } else {
            System.out.println("Id nao encontrado!");
        }

    }

    public void pedirEmprestimo() {
        Scanner read = new Scanner(System.in);
        int id, retorno;
        System.out.println("Digite o id da conta corrente a ser consultada!");
        id = read.nextInt();
        retorno = this.searchByIdC(id);
        if (retorno != -1) {
            contaC[retorno].pedirEmprestimo();
        } else {
            System.out.println("Id nao encontrado!");
        }

    }

    public void searchRegC() {

        Scanner read = new Scanner(System.in);
        System.out.println("Qual o id para busca? ");
        int x = read.nextInt();
        int resultado = this.searchByIdC(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta corrente encontrada!");
            contaC[resultado].showAll();
        } else {
            System.out.println("Conta corrente nao encontrada!");
            return;
        }

    }
    
    public void sacarCorrente() {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual o id para busca? ");

        int x = read.nextInt();
        int resultado = this.searchByIdC(x);

        System.out.println("resultado busca: " + resultado);

        if (resultado >= 0) {
            System.out.println("Conta poupanca encontrada!");
            System.out.println("Quanto deseja sacar?");
            float saque = read.nextFloat();
            while (saque < 0) {
                System.out.println("Quantia invalida! ");
                System.out.println("Quanto deseja sacar?");
                saque = read.nextFloat();
            }

            contaC[resultado].sacar(saque);
        }

    }

    public void depositarC() {
        Scanner read = new Scanner(System.in);
        int id, retorno;
        float valor;
        System.out.println("Digite o id da conta corrente a depositar!");
        id = read.nextInt();

        retorno = this.searchByIdC(id);
        if (retorno != -1) {
            System.out.println("Conta corrente encontrada!");
            System.out.println("Quanto deseja depositar? ");
            valor = read.nextInt();
            while (valor < 1) {
                System.out.println("Quantia invalida! ");
                System.out.println("Quanto deseja depositar?");
                valor = read.nextInt();
            }

            contaC[retorno].depositar(valor);
        } else {
            System.out.println("Id nao encontrado!");
        }

    }

    //Geral
    public void searchGeral() {
        Scanner read = new Scanner(System.in);
        int achou = 0;
        System.out.println("Listar contas por saldo");
        System.out.println("Digite procurar contas com saldo maior ou igual que: ");
        float busca = read.nextFloat();

        for (int i = 0; i < contadorP; i++) {

            if (contaP[i].getSaldo() >= busca) {
                System.out.println("ID: " + contaP[i].getId());
                System.out.println("Saldo: " + contaP[i].getSaldo());
                achou++;

            }
        }
        for (int i = 0; i < contadorC; i++) {
            if (contaC[i].getSaldo() > busca) {
                System.out.println("ID: " + contaC[i].getId());
                System.out.println("Saldo: " + contaC[i].getSaldo());
                achou++;
            } else {
                System.out.println("Nenhum registro encontrado");
                return;
            }

        }
        if (achou == 0) {
            System.out.println("NENHUM REGISTRO ENCONTRADO");
        }

    }

    public void deletar() {
        Scanner read = new Scanner(System.in);
        int retorno, retorno2;
        System.out.println("Deseja deletar uma conta poupanca ou corrente? 1-poupanca 2-corrente");
        int op = read.nextInt();

        if (op == 1) {
            System.out.println("digite o id: ");
            int busca = read.nextInt();
            retorno = this.searchByIdP(busca);
            if (retorno != -1) {

                contaP[retorno] = contaP[contadorP];
                contaP[contadorP] = null;
                contadorP--;
                System.out.println("Conta deletada com sucesso!");
            } else {
                System.out.println("ID nao encontrado");
            }
        }
        if (op == 2) {
            System.out.println("digite o id: ");
            int busca = read.nextInt();
            retorno = this.searchByIdC(busca);
            if (retorno != -1) {

                contaC[retorno] = contaC[contadorC];
                contaC[contadorC] = null;
                contadorC--;

                System.out.println("Conta deletada com sucesso!");
            } else {
                System.out.println("ID nao encontrado");
            }

        }
    }

}
