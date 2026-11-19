import java.util.Scanner;

/** Ler um valor e escrever se é positivo, negativo ou zero. */

public class Exercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor : ");
        valor = sc.nextInt();

        if (valor > 0){
            System.out.println("Valor digitado é Positivo");
        }else if (valor <0){
            System.out.println("Valor digitado é negativo");
        }else{
            System.out.println("Valor digitado é Zero");
        }









        sc.close();

    }
}
