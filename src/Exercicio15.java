import java.util.Scanner;

/** Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

public class Exercicio15 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int primeiroValor,segundoValor;

        System.out.print("Digite um valor :");
        primeiroValor = sc.nextInt();

        System.out.print("Digite o segundo valor :");
        segundoValor = sc.nextInt();


        if (primeiroValor > segundoValor){
            System.out.printf("O maior valor é : %d%n ",primeiroValor);
        }else if (segundoValor > primeiroValor){
            System.out.printf("O maior valor é : %d%n",segundoValor);
        }else {
            System.out.println("Os dois valores digitados são iguais");
        }







        sc.close();
    }
}
