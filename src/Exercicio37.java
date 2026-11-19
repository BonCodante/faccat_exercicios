import java.util.Scanner;
/** Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
 estar em condições, um dos seguintes requisitos deve ser satisfeito:
 - Ter no mínimo 65 anos de idade.
 - Ter trabalhado no mínimo 30 anos.
 - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
 de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
 de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. */


public class Exercicio37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigoEmpregado;
        int anoNascimento;
        int anoIngresso;
        int anoAtual;
        int idade;
        int tempoTrabalho;

        System.out.print("Digite o número (código) do empregado: ");
        codigoEmpregado = sc.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        anoNascimento = sc.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        anoIngresso = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        idade = anoAtual - anoNascimento;
        tempoTrabalho = anoAtual - anoIngresso;

        System.out.printf("Empregado código %d:%n", codigoEmpregado);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Tempo de trabalho: %d anos%n", tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }




        sc.close();
    }
}
