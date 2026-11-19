import java.util.Scanner;

/** Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
 ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
 dos outros 2 lados. */

public class Exercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double ladoA,ladoB,ladoC;

        System.out.print("Digite o lado A :");
        ladoA = sc.nextDouble();

        System.out.print("Digite o lado B : ");
        ladoB = sc.nextDouble();

        System.out.print("Digite o lado C : ");
        ladoC = sc.nextDouble();

        if ((ladoA < ladoB + ladoC) &&(ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB )){
            System.out.printf("Os valores %.1f %.1f %.1f, formam um triângulo", ladoA,ladoB,ladoC);
        }else {
            System.out.printf("Os valores %.1f %.1f %.1f, não formam um triângulo", ladoA,ladoB,ladoC);
        }






        sc.close();

    }
}
