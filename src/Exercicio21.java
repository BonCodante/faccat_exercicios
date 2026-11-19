import java.util.Scanner;

/** Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
 escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
 ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */

public class Exercicio21 {


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);


        int numeroDaConta;
        double saldo,credito,debito,saldoAtual;

        System.out.print("Digite o número da conta : ");
        numeroDaConta = sc.nextInt();

        System.out.print("Digite o saldo da sua conta : ");
        saldo = sc.nextDouble();

        System.out.print("Digite o valor que saiu da sua conta : ");
        debito = sc.nextDouble();

        System.out.print("Digite o valor que entrou na sua conta :");
        credito = sc.nextDouble();

        saldoAtual = saldo - debito + credito;

        System.out.printf("Sua conta: %d | Seu Saldo Atual é: %.2f%n", numeroDaConta,saldoAtual);

        if (saldoAtual >=0){
            System.out.println("Saldo Positivo");
        }else{
            System.out.println("Saldo Negativo");
        }



     












        sc.close();



    }
}
