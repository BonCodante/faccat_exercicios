import java.util.Scanner;
/**
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * Até 5 Kg Acima de 5 Kg
 * Morango R$ 2,50 por Kg R$ 2,20 por Kg
 * Maçã R$ 1,80 por Kg R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
 * ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
 * morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */


public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kgMorango,kgMaca,pesoTotal,valorTotal,precoMorango,precoMaca,subTotalMorango,subTotalMaca;

        System.out.print("Digite o KG de morango comprado : ");
        kgMorango = sc.nextDouble();

        System.out.print("Digite o KG de maça comprado : ");
        kgMaca = sc.nextDouble();

        if (kgMorango <= 5){
            precoMorango = 2.50;
        }else{
            precoMorango = 2.20;
        }
        subTotalMorango = kgMorango * precoMorango;

        if (kgMaca <=5){
            precoMaca = 1.80;
        }else{
            precoMaca = 1.50;
        }
        subTotalMaca = kgMaca * precoMaca;

        pesoTotal = kgMorango + kgMaca;
        valorTotal = subTotalMorango + subTotalMaca;

        if (pesoTotal > 8 || valorTotal > 25.00){
            valorTotal = valorTotal * 0.90;
        }

        System.out.printf("O Valor a ser pago pelo cliente é %.2f",valorTotal);


        sc.close();
    }
}
