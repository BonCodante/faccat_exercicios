import java.util.Scanner;

/** Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
 diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
 mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
 esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
 senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’ */

public class Exercicio34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigoInterno  = 1234;
        int senhaInterna = 9999;
        int codigoDoUsuario;
        int senhaUsuario;


        System.out.print("Digite um código de usúario : ");
        codigoDoUsuario = sc.nextInt();

        System.out.print("Digite a senha do usúario :");
        senhaUsuario = sc.nextInt();


        if (codigoDoUsuario == codigoInterno ){
            System.out.println("Usuário Válido");
        }else{
            System.out.println("Usuário Inválido ");
        }

        if (senhaUsuario == senhaInterna){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("senha incorreta");
        }


        sc.close();



    }
}
