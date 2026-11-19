import java.util.Scanner;

public class Exercicio17 {
    /**  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
     minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
     de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inicioPartida, fimPartida, duracao;

        System.out.print("Digite a hora do início da partida : ");
        inicioPartida = sc.nextInt();

        System.out.print("Digite a hora do fim da partida : ");
        fimPartida = sc.nextInt();

        if (fimPartida > inicioPartida){
            duracao = fimPartida - inicioPartida;

        }else {
            duracao = 24 - inicioPartida + fimPartida;
        }

        System.out.printf("A duração de uma partida é : %d hora(s)%n", duracao);

        sc.close();
    }
}
