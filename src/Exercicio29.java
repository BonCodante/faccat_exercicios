import java.util.Scanner;

/** Ler dois valores e imprimir uma das três mensagens a seguir:
 *
 ‘Números iguais’, caso os números sejam iguais

 ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

 ‘Segundo maior’, caso o segundo seja maior que o primeiro.  */


public class Exercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int primeiroValor,segundoValor;

        System.out.print("Digite um primeiro valor : ");
        primeiroValor = sc.nextInt();

        System.out.print("Digite um segundo valor : ");
        segundoValor = sc.nextInt();


        if (primeiroValor == segundoValor){
            System.out.printf("Os valores %d e %d são iguais%n", primeiroValor,segundoValor);
        }else if (primeiroValor > segundoValor){
            System.out.printf("O valor %d é maior que o segundo valor %d%n",primeiroValor,segundoValor);
        }else{
            System.out.printf("O valor %d é maior que o primeiro valor %d%n",segundoValor,primeiroValor);
        }









        sc.close();
    }
}
