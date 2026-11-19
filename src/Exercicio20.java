import java.util.Scanner;

public class Exercicio20 {

    /** Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
    ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
    ultrapassar este valor, calcular e escrever o seu salário total.*/


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salarioFixo, totaldeVendas, comissaoTotal, salarioTotal;
        double comissaoLimite = 1500.0;

        System.out.print("Digite seu salário fixo : ");
        salarioFixo = sc.nextDouble();

        System.out.print("Digite o total de vendas : ");
        totaldeVendas = sc.nextDouble();

        if (totaldeVendas <=comissaoLimite){
            comissaoTotal = totaldeVendas * 0.03;
        }else{

            comissaoTotal =45.0 + ((totaldeVendas - 1500.0)* 0.05);

        }

        salarioTotal = salarioFixo + comissaoTotal;

        System.out.printf("Comissão total é : %.2f%n", comissaoTotal);
        System.out.printf("Salário total é : %.2f%n", salarioTotal);



        sc.close();

    }
}
