import java.util.Scanner;

/**  Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
 crescente. */

public class Exercicio26 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite 3 valores : ");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        int auxiliar;

        if(valor1 > valor2){
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }

        if (valor1 > valor3){
            auxiliar = valor1;
            valor1 = valor3;
            valor3 = auxiliar;
        }

        if (valor2 > valor3){
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;

        }

        System.out.printf("Ordem crescente é : %d, %d, %d%n",  valor1,valor2,valor3);











        sc.close();
    }
}
