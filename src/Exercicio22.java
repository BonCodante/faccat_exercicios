import java.util.Scanner;

/** Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
 quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
 média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
 a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
 compra' */

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String produto;
        int estoqueAtual,estoqueMaximo,estoqueMinimo;
        double mediaEstoque;

        System.out.print("Digite o nome do produto : ");
        produto = sc.nextLine();

        System.out.print("Digite a quantidade atual em estoque : ");
        estoqueAtual = sc.nextInt();

        System.out.print("Digite a quantidade mínima para estoque : ");
        estoqueMinimo = sc.nextInt();

        System.out.print("Digite a quantidade de estoque Máximo : ");
        estoqueMaximo = sc.nextInt();

        mediaEstoque =(estoqueMaximo + estoqueMinimo) /2.0;

        System.out.printf("O Produto %s | A media em estoque é : %.1f%n",produto,mediaEstoque);

        if (estoqueAtual >= mediaEstoque ){
            System.out.println("Não efetuar a compra");
        }else{
            System.out.println("Efetuar a Compra");
        }













        sc.close();
    }
}
