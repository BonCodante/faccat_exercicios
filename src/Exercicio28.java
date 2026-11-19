import java.util.Scanner;

/** Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
 do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. */

public class Exercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String time1, time2;
        int numeroDeGolsCasa;
        int numeroDeGolsVisitante;

        System.out.print("Digite o nome do Time da Casa : ");
        time1 = sc.nextLine();

        System.out.print("Digite o nome do Time Visitante : ");
        time2 = sc.nextLine();

        System.out.print("Digite a quantidade de Gols marcados pelo time da casa : ");
        numeroDeGolsCasa = sc.nextInt();

        System.out.print("Digite a quantidade de Gols marcados pelo time visitante : ");
        numeroDeGolsVisitante = sc.nextInt();

        if (numeroDeGolsCasa > numeroDeGolsVisitante){
            System.out.printf("O %s é o time da Casa, marcou %d Gols, e é o Vencedor da Partida%n",time1,numeroDeGolsCasa);
        } else if (numeroDeGolsVisitante > numeroDeGolsCasa){
            System.out.printf("O %s é o time visitante, marcou %d Gols, e é o Vencedor da Partida%n",time2,numeroDeGolsVisitante);
        }else{
            System.out.printf("A partida entre os times %s e %s, terminou Empatada %n",time1,time2);
        }


        sc.close();
    }
}
