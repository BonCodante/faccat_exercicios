import java.util.Scanner;

public class Exercicio25 {

    /** Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
     maiores. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor1,valor2,valor3,soma;

        System.out.print("Digite um valor : ");
        valor1 = sc.nextInt();

        System.out.print("Digite outro Valor : ");
        valor2 = sc.nextInt();

        System.out.print("Digite mais um Valor : ");
        valor3 = sc.nextInt();

        if (valor1 < valor2 && valor1 < valor3){
            soma = valor2 + valor3;
        } else if (valor2 < valor3) {
            soma = valor1 + valor3;
        }else{
            soma = valor1 + valor2;
        }

        System.out.printf("A soma dos dois maiores valores é %d",soma);


        sc.close();

    }
}
