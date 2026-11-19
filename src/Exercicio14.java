import java.util.Scanner;

/** Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
 poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).  */


public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int anoAtual,anoNascimento,idade;

        System.out.print("Digite o ano Atual : ");
        anoAtual = sc.nextInt();

        System.out.print("Digite o seu Ano de Nascimento : ");
        anoNascimento = sc.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >=16){
            System.out.println("Você pode Votar este ano");
        }else {
            System.out.println("Você não Pode Votar esse ano");
        }

        System.out.printf("O Ano atual é : %d%n", anoAtual);
        System.out.printf("O Ano de nascimento é : %d%n",anoNascimento);
        System.out.printf("A idade da pessoa é : %d",idade);






        sc.close();
    }
}
