        import java.util.Scanner;

        /** Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.  */

        public class Exercicio24 {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int primeiroValor,segundoValor,terceiroValor;

                System.out.print("Digite o primeiro Valor : ");
                primeiroValor = sc.nextInt();

                System.out.print("Digite o segundo Valor : ");
                segundoValor = sc.nextInt();

                System.out.print("Digite o terceiro valor : ");
                terceiroValor = sc.nextInt();

                if (primeiroValor > segundoValor && primeiroValor > terceiroValor){
                    System.out.println("O Maior valor é : " +primeiroValor);
                }else if (segundoValor > terceiroValor){
                    System.out.println("O Maior valor é : " + segundoValor);
                }else{
                    System.out.println("O Maior valor é : " + terceiroValor);
                }




                sc.close();

            }
        }
