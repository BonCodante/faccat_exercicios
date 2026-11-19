import java.util.Scanner;

public class Exercicio19 {
     /** Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
      e mostre seu peso ideal, utilizando as seguintes fórmulas:
      - para sexo masculino: peso ideal = (72.7 * altura) - 58
      - para sexo feminino: peso ideal = (62.1 * altura) - 44.7
      inicio
      ler altura
      ler nome  pendente a variável alltura : exp ler altura
      ler sexo
      se sexo = M então - Falta das aspas para comparação literal do caractre / texto
      peso_ideal  (72.7 * altura) - 58
      senão
      peso_ideal  (62.1 * altura) – 44.7 -
      fim_se
      e */

    public  static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String nome;
        double altura;
        char sexo;
        double pesoIdeal = 0.0;

        System.out.print("Digite seu nome : ");
        nome = sc.nextLine();

        System.out.print("Digite sua altura : ");
        altura = sc.nextDouble();

        System.out.print("Digite o sexo F/M :");
        sexo = sc.next().charAt(0);

        if(sexo == 'M'||sexo =='m'){
            pesoIdeal =(72.7 * altura) -58;
            System.out.printf("%s, o seu Peso ideal é %.2f kg%n", nome, pesoIdeal);

        }else if (sexo == 'F' || sexo =='f'){
            pesoIdeal  = (62.1 *altura ) -44.7;
            System.out.printf("%s o seu Peso ideial é %.2f kg%n", nome, pesoIdeal);
        }else{
            System.out.println("Erro : Sexo informado é inválido !");
        }

sc.close();
    }
}
