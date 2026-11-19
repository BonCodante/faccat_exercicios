import java.util.Scanner;

/** Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 Calcular e escrever o valor do novo salário. */


public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salarioAtual, percentual, novoSalario, valorDoAumento;

        System.out.println("Digite seu salario atual : ");
        salarioAtual = sc.nextDouble();

        System.out.println("Digite o reajuste : ");
        percentual = sc.nextDouble();


        valorDoAumento = salarioAtual *(percentual/100.0);
        novoSalario = salarioAtual + valorDoAumento;

        System.out.printf("O Valor do Aumento foi : %.2f%n", valorDoAumento);
        System.out.printf("O Sálario com aumento é : %.2f%n", novoSalario);




        sc.close();



    }



}
