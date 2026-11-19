import java.util.Scanner;

public class Exercicio06 {

    /**  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
    calcular e escrever o custo final ao consumidor. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double custoDeFabrica;
        double percentualDistribuidor = 0.28;
        double percentualImposto = 0.45;
        double precoFinal;
        double valorDistribuidor;
        double valorImposto;


        System.out.println("Digite o custo de Fábrica do Carro : ");
        custoDeFabrica = sc.nextDouble();

        valorDistribuidor = custoDeFabrica * percentualDistribuidor;
        valorImposto = custoDeFabrica * percentualImposto;

        precoFinal = (custoDeFabrica + valorDistribuidor + valorImposto);

        System.out.printf("O Valor final do Automóvel ao Consumidor é : R$ %.2f%n", precoFinal);


        sc.close();
    }
}
