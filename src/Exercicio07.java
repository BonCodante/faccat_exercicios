import java.util.Scanner;

/** Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.*/

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioFixo;
        double percentualVendas = 0.05;
        double valorTotalDeVendas;
        int totalCarrosVendidos;
        double valorPorCarroVendido;
        double salarioFinal;
        double comissaoPorCarros;
        double comissaoPorVendas;



        System.out.println("Digite a quantidade de carros vendidos : ");
        totalCarrosVendidos = sc.nextInt();

        System.out.println("Digite o valor Total de Suas Vendas : ");
        valorTotalDeVendas = sc.nextDouble();

        System.out.println("Digite seu Salário fixo : ");
        salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor a receber por cada Carro Vendido : ");
        valorPorCarroVendido = sc.nextDouble();

        comissaoPorCarros = (totalCarrosVendidos * valorPorCarroVendido);

        comissaoPorVendas = (valorTotalDeVendas * percentualVendas);

        salarioFinal = (salarioFixo + comissaoPorCarros + comissaoPorVendas);


        System.out.printf("%n--- Resumo Salário ----%n");
        System.out.printf("Salário fixo : R$ %.2f%n",salarioFixo);
        System.out.printf("Comissão por carros (%d vendidos): R$ %.2f%n",totalCarrosVendidos,comissaoPorCarros);
        System.out.printf("Comissão de 5%% sobre as Vendas : R$ %.2f%n",comissaoPorVendas);
        System.out.printf("O Salário final do vendedor é : R$ %.2f",salarioFinal);

sc.close();

    }
}
