import java.util.Scanner;
/** Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
 exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
 e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
 N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
 Média_de_Aproveitamento = ---------------------------------------------------------
 7  */

public class Exercicio36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double mediaExercicios;
        double mediaAproveitamento;
        char conceito;

        System.out.print("Digite a nota N1: ");
        numero1 = sc.nextDouble();

        System.out.print("Digite a nota N2: ");
        numero2 = sc.nextDouble();

        System.out.print("Digite a nota N3: ");
        numero3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        mediaExercicios = sc.nextDouble();

        mediaAproveitamento = (numero1 + (numero2 * 2.0) + (numero3 * 3.0) + mediaExercicios) / 7.0;

        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.printf("Média de Aproveitamento: %.2f%n", mediaAproveitamento);
        System.out.printf("Conceito Final: %c%n", conceito);





        sc.close();

    }
}
