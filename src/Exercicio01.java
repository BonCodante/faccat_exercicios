import java.util.Scanner;

/** Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */


    public class Exercicio01{

public  static  void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   int numero;

    System.out.println("Digite um número :");
    numero = sc.nextInt();


    System.out.println("O Antecessor do número digitado é " + (numero - 1));




   sc.close();

}
        }