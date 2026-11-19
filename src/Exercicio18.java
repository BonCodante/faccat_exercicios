import java.util.Scanner;

public class Exercicio18 {

    /** A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
     de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
     Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
     o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
     (considere que o mês possua 4 semanas exatas)*/

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double horasTrabalhadas,salarioPorHora,salarioTotal,horasExtras,valorHoraExtra;

        // O uso do modificador 'final' impede que o valor 160 seja alterado acidentalmente.
        final int horasMes = 160;

        System.out.print("Digite as horas trabalhadas : ");
        horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor do salário por hora : ");
        salarioPorHora = sc.nextDouble();



        if (horasTrabalhadas > horasMes){

            horasExtras = horasTrabalhadas - horasMes;
            valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasMes * salarioPorHora) + (horasExtras * valorHoraExtra);
        }else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        System.out.printf("O Salário total do funcionário é : %.2f%n", salarioTotal);



        sc.close();


    }
}


