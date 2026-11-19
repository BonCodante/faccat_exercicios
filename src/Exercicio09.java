import java.util.Scanner;

/** Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
 Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
 final é:
 n1 * 2 + n2 * 3 + n3 * 5
 mediafinal = -
 10  */


public class Exercicio09 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        double nota1,nota2,nota3,mediaFinal;

        System.out.println("Digite a primeira nota : ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota : ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota : ");
        nota3 = sc.nextDouble();

        mediaFinal = ((nota1 *2) + (nota2 *3) + (nota3 *5 )) / 10.0;

        System.out.printf("A sua média final é : %.1f", mediaFinal);




        sc.close();

    }
}
