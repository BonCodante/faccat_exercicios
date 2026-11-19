import java.util.Scanner;

/** As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
 compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
 escreva o custo total da compra. */


public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantidadeDeMacas;
        double precoUnitario;
        double custoTotal;


        System.out.print("Digite a quantidade de maças Compradas : ");
        quantidadeDeMacas = sc.nextInt();

        if (quantidadeDeMacas <12){
            precoUnitario = 1.30;

        }else {
            precoUnitario = 1.00;
        }

        custoTotal = (quantidadeDeMacas * precoUnitario);


        System.out.printf("O Custo total de Compras de Maças é : R$ %.2f%n", custoTotal);








        sc.close();

    }
}
