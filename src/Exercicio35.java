import java.util.Scanner;

    /** Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
 unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
 a pagar (total a pagar = total - desconto), sabendo-se que:
 - Se quantidade <= 5 o desconto será de 2%
 - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 - Se quantidade > 10 o desconto será de 5% */

public class Exercicio35 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String descricaoProduto;
        int quantidade;
        double precoUnitario;
        double total;
        double desconto;
        double totalAPagar;

        System.out.print("Digite a descrição (nome) do produto: ");
        descricaoProduto = sc.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        quantidade = sc.nextInt();

        System.out.print("Digite o preço unitário: R$ ");
        precoUnitario = sc.nextDouble();

        total = quantidade * precoUnitario;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        totalAPagar = total - desconto;

        System.out.printf("Produto: %s%n", descricaoProduto);
        System.out.printf("Total Bruto: R$ %.2f%n", total);
        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);



        sc.close();

    }
}
