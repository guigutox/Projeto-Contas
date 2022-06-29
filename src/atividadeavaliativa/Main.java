package atividadeavaliativa;


import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Vetores v = new Vetores();
        int op, op2, op3;

        System.out.println("Digite o que deseja fazer: 1-conta poupanca 2-conta corrente 3-Busca geral 4-Deletar registro ");
        op = read.nextInt();

        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.println("0- Sair; \n1- Cadastrar poupanca; \n2-Procurar poupanca; \n3-Verificar rendimento; \n4-Sacar Poupanca; \n5-Depositar");
                    op2 = read.nextInt();
                    while (op2 != 0) {
                        switch (op2) {

                            case 1:
                                System.out.println("\t-----------\n");
                                v.cadastrarPoupanca();
                                break;

                            case 2:
                                System.out.println("\t-----------\n");
                                v.searchReg();
                                break;

                            case 3:
                                System.out.println("\t-----------\n");
                                v.verificaRendimento();
                                break;
                            case 4:
                                System.out.println("\t-----------\n");
                                v.sacarpoupanca();
                                break;
                            case 5:
                                System.out.println("\t-----------\n");
                                v.depositarP();
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                        System.out.println("O que deseja fazer agora na poupanca?");
                        op2 = read.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("0- Sair; \n1-Cadastrar corrente; \n2-Aumentar Limite; \n3-Status para emprestimo; \n4-Procurar corrente; \n5-Depositar; \n6-Sacar.");
                    op3 = read.nextInt();
                    while (op3 != 0) {
                        switch (op3) {
                            case 1:
                                System.out.println("\t-----------\n");
                                v.cadastrarCorrente();
                                break;
                            case 2:
                                System.out.println("\t-----------\n");
                                v.verificarLimite();
                                break;
                            case 3:
                                System.out.println("\t-----------\n");
                                v.pedirEmprestimo();
                                break;
                            case 4:
                                System.out.println("\t-----------\n");
                                v.searchRegC();
                                break;
                            case 5:
                                System.out.println("\t-----------\n");
                                v.depositarC();
                                break;
                            case 6:
                                System.out.println("\t-----------\n");
                                v.sacarCorrente();
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }
                        System.out.println("O que deseja fazer agora na Conta corrente:");
                        op3 = read.nextInt();

                    }
                    break;

                case 3:
                    System.out.println("\t-----------\n");

                    v.searchGeral();
                    break;
                case 4:
                    System.out.println("\t-----------\n");
                    v.deletar();
                    break;

                default:
                    System.out.println("Digite uma opcao valida");

            }
            System.out.println("Digite o que deseja fazer: 1-conta poupanca 2-conta corrente 3-Busca geral 4-Deletar registro ");
            op = read.nextInt();
        }
    }
}
