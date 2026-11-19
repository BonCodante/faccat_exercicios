import java.util.Scanner;

/** Seja o seguinte algoritmo:
 inicio
 ler a, b, c
 se (a < b+c) e (b <a+c) e (c <a+b) então
 se (a=b) e (b=c) então
 mens  'Triângulo Equilátero'
 senão
 se (a=b) ou (b=c) ou (a=c) então
 mens  'Triângulo Isósceles'
 senão
 mens  'Triângulo Escaleno'
 fim_se
 fim_se
 senão
 mens  'Não e possível formar um triângulo'
 fim_se
 escrever mens
 fim
 Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das variáveis: */

public class Exercicio38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        String mens;

        System.out.print("Digite o valor do lado A: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        c = sc.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if ((a == b) && (b == c)) {
                mens = "Triângulo Equilátero";
            } else {
                if ((a == b) || (b == c) || (a == c)) {
                    mens = "Triângulo Isósceles";
                } else {
                    mens = "Triângulo Escaleno";
                }
            }
        } else {
            mens = "Não e possível formar um triângulo";
        }

        System.out.println(mens);





        sc.close();



    }
}
