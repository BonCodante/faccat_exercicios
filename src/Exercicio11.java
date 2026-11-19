import java.util.Scanner;

/**  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).  */

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor : ");
        valor = sc.nextInt();

        if (valor >=0){
            System.out.println("Valor digitado é Positivo");
        }else {
            System.out.println("Valor digitado é Negativo");
        }



        sc.close();
    }
}
