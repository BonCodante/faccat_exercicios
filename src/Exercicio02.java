/** Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo. */


import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double base,altura,area;

        System.out.println("Digite a base do Retângulo : ");
        base = sc.nextDouble();

        System.out.println("Digite a altura do Retângulo : ");
        altura = sc.nextDouble();

        area = (altura * base);

        System.out.printf("A área do retângulo é: %.2f;\n", area);




        sc.close();
    }
}
