import java.util.Scanner;

/*
    A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras
que iria verificar se os carros estão acima de 80km/h.
    Porém, eles queriam também anotar a placa dos carros no banco de dados para que, a partir de 3 multas,
os motoristas perdessem pontos diretamente na carteira de habilitação.
    Para isso, contrataram você para realizar esse programa, logo que você fez um trabalho tão bom para a cidade A.
    Lembrando que toda vez que um carro é pego pela câmera e está acima da velocidade permitida automaticamente
já é contabilizado uma multa para ele.
 */
public class PontosNaCarteira {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int velocidade = leitor.nextInt();
            int multas = leitor.nextInt();

            if (velocidade <= 80) {
                System.out.format(multas + " multas. Nao levou pontos na carteria");
            } else {
                if (multas < 2)  {
                    multas++;
                    System.out.println(multas +  " multas. Nao levou pontos na carteira");
                } else {
                    multas++;
                    System.out.println(multas + " multas. Levou pontos na carteira");
                }
            }
        }
    }
