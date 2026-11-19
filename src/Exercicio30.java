import java.util.Scanner;

/** início
 ler x
 ler y
 z  (x*y) + 5
 se z <= 0 então
 resposta  ‘A’
 senão
 se z <= 100 então
 resposta  ‘B’
 senão
 resposta  ‘C’
 fim_se
 fim_se
 escrever z, resposta
 fim
 Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:*/


public class Exercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite X: ");
        int x = sc.nextInt();

        System.out.print("Digite Y: ");
        int y = sc.nextInt();

        int z = (x * y) + 5;
        char resposta;


        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.printf("Z = %d, Resposta = %c%n", z, resposta);






        sc.close();
    }
}
