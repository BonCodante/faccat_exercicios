import java.util.Scanner;

/** Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 até 20 litros, desconto de 3% por litro Álcool
 acima de 20 litros, desconto de 5% por litro
 até 20 litros, desconto de 4% por litro Gasolina
 acima de 20 litros, desconto de 6% por litro
 Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
 seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
 que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. */


public class Exercicio31 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        double litroVendido,precoComDesconto,valorTotal;
        double preco = 0.0;
        double percentualDesconto = 0.0;
        char tipoDoCombustivel;


        System.out.print("Digite a quantidade de Litros Vendidos :  ");
        litroVendido = sc.nextDouble();

        System.out.print("Digite o tipo de Combustível (A - Alcool, G - Gasolina ):  ");
        tipoDoCombustivel = sc.next().toUpperCase().charAt(0);


        if (tipoDoCombustivel == 'A'){
            preco = 2.90;
            if (litroVendido <=20){
                percentualDesconto = 0.03;
            }else {
                percentualDesconto = 0.05;
            }
        } else if (tipoDoCombustivel == 'G'){
            preco = 3.30;
            if (litroVendido <=20){
                percentualDesconto = 0.04;
            }else{
                percentualDesconto = 0.06;
            }
        }else{
            System.out.println("Tipo de Combustível inválido : use apenas A OU G");
            sc.close();
            return;
        }



        precoComDesconto = preco * (1.0 - percentualDesconto);
        valorTotal = litroVendido * precoComDesconto;

        System.out.printf("O Valor a ser pago pelo cliente é : R$ %.2f%n",valorTotal);


        sc.close();
        return;

    }
}
