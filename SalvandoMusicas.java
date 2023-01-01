/*
Sua irmã está com o computador muito lento e pediu para você formata-lo.
Mas ela gostaria muito de que todas as músicas dela fossem salvas e não deletadas com o resto dos arquivos durante a formatação.
Todas as músicas estão no formato ".mp3".

Crie um programa que cada arquivo com esse formato não seja deletado.
 */
import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String s = ".mp3";
        boolean resultado = arquivoDoPc.contains("mp3");
        if ( resultado == false) {
            System.out.println ("Deletar");
        }else{
            System.out.println("Salvar");
        }

        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada

    }
}
