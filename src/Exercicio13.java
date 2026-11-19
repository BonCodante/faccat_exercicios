import java.util.Scanner;

/** Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
 uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
 aluno é aprovado). Escrever também a média calculada. */


public class Exercicio13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double nota1,nota2,media;


        System.out.println("Digite a primeira Nota");
        nota1 = sc.nextDouble();

        System.out.println("Digite a Segunda nota");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2.0;


        if (media >=6){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }

        System.out.printf("A primeira nota do Aluno é : %.1f%n", nota1);
        System.out.printf("A segunda nota do aluno é : %.1f%n", nota2);
        System.out.printf("A Média final do aluno é : %.1f%n", media);





        sc.close();
    }
}
