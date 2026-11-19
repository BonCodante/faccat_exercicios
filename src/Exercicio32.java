import java.util.Scanner;

/**
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
 * dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
 * das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
 * novo com a mulher mais velha.
 */


public class Exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int homem1, homem2, mulher1, mulher2,somaIdade,produto, homemMaisVelho,homemMaisNovo,mulherMaisVelha,mulherMaisNova;

        System.out.print("Digite a idade do primeiro Homem : ");
        homem1 = sc.nextInt();

        System.out.print("Digite a idade do segundo Homem : ");
        homem2 = sc.nextInt();

        System.out.print("Digite a idade da primeira Mulher : ");
        mulher1 = sc.nextInt();

        System.out.print("Digite a idade da segunda Mulher : ");
        mulher2 = sc.nextInt();

        if (homem1 > homem2){
            homemMaisVelho = homem1;
            homemMaisNovo = homem2;
        }else {
            homemMaisVelho = homem2;
            homemMaisNovo = homem1;
        }

        if (mulher1 > mulher2){
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        }else {
            mulherMaisVelha = mulher2;
            mulherMaisNova = mulher1;
        }

        somaIdade = (homemMaisVelho + mulherMaisNova);
        produto = (homemMaisNovo * mulherMaisVelha);

        System.out.printf("A soma das idades é : %d, e o produto das idade é : %d ",somaIdade,produto);








        sc.close();
    }

}
