import java.util.Scanner;

/*
Resolvendo desafios - Fundamentos da Linguagem de Programação Java

Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade,
seguido pelo valor correspondente à soma de A e B.
 */
public class SomaSimples {


    public class Problem {

        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            int A, B, soma;

            A = sc.nextInt();
            B = sc.nextInt();
            //TODO: Complete os espaços em branco com uma possível solução para o desafio
            soma =  A + B;

            System.out.println("SOMA = " + soma);
        }
    }

}
