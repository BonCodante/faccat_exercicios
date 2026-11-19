import java.util.Scanner;

/** Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
 dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.   */


public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anosTotais;
        int diasTotais;
        int mesesTotais;
        int dias;

        System.out.println("Digite os anos :");
        anosTotais = sc.nextInt();

        System.out.println("Digite os meses : ");
        mesesTotais = sc.nextInt();

        System.out.println("Digite os dias :");
        dias = sc.nextInt();

        diasTotais = (anosTotais *365) + (mesesTotais *30) +dias;

        System.out.printf("A idade da pessoa expressa em dias é %d%n ", diasTotais);


        sc.close();
    }

}
