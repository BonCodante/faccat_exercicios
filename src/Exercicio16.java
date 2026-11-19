import java.util.Scanner;

public class Exercicio16 {

    /** Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente */


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int valor1,valor2;

        System.out.print("Digite o primeiro valor : ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor : ");
        valor2 = sc.nextInt();

        if(valor1 < valor2){
            System.out.printf("Valor na ordem crescente é :  %d %d%n", valor1,valor2 );
        }else {
            System.out.printf("Valor na ordem crescente é : %d %d%n", valor2,valor1 );
        }








        sc.close();







    }
}
