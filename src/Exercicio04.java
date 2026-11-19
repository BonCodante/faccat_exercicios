import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /** Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
        brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
        de eleitores. */

        double votosBrancos;
        double votosNulos;
        double votosValidos;
        double totalDeEleitores;
        double percentualVotosBrancos;
        double percentualVotosValidos;
        double percentualVotosNulos;


        System.out.println("Digite a quantidade de votos em Branco :");
        votosBrancos = sc.nextDouble();

        System.out.println("Digite a quantidade de votos Nulos :");
        votosNulos = sc.nextDouble();

        System.out.println("Digite a quantidade de votos Válidos :");
        votosValidos = sc.nextDouble();

        System.out.println("Digite o total de Eleitores :");
        totalDeEleitores = sc.nextDouble();
if (totalDeEleitores <=0){
    System.out.println("Erro:  o total de eleitores deve ser maior quero zero");
}
else if (votosBrancos < 0 || votosNulos <0 || votosValidos <0){
    System.out.println(" Erro: A quantidade de votos não podem ser negativas");
}

else if((votosBrancos + votosNulos + votosValidos)> totalDeEleitores){
    System.out.println("Erro: A soma dos votos (Brancos + Nulos + Válidos ) é maior que o total de eleitores");
}

        else{
            percentualVotosBrancos = (votosBrancos / totalDeEleitores) * 100;

            percentualVotosNulos = (votosNulos / totalDeEleitores) * 100;

            percentualVotosValidos = (votosValidos / totalDeEleitores) * 100;

            System.out.printf("O Percentual de votos em Brancos é %.2f%%%n", percentualVotosBrancos);
            System.out.printf("O Percentual de votos Nulos é %.2f%%%n", percentualVotosNulos);
            System.out.printf("O Percentual de votos Válidos é %.2f%%%n", percentualVotosValidos);


        }

        sc.close();
    }
}
