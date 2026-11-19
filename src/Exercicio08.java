import java.util.Scanner;

/** 12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
 correspondente em graus Celsius (baseado na fórmula abaixo):
 C F - 32
 ---------- = -----------
 5 9
 Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F */


public class Exercicio08 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double celsius;


        System.out.println("Digite a temperatura em Fahrenheit : ");
        fahrenheit = sc.nextDouble() ;

        celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.printf("A Temperatura convertida para Graus celsius é : %.1f ºC%n", celsius);





        sc.close();
    }
}





