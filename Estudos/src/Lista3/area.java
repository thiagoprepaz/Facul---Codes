package Lista3;
import java.util.Scanner;
public class area {
    /*
     * Faça um programa em Java que calcula a área de um terreno para uma
     * imobiliária.
     * 
     * Inicialmente deve-se imprimir uma mensagem pedindo para informar a largura e
     * comprimento do terreno e depois efetuar a leitura desses valores. Ao final o
     * programa deve imprimir a área total do terreno.
     * 
     * Exemplo de entrada:
     * 
     * Informe a largura do terreno: 36
     * Informe o comprimento do terreno: 60
     * A saída esperada deverá ser:
     * 
     * O terreno 36x60 tem 2160 metros quadrados
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a largura do terreno:");
        int l = input.nextInt();
        System.out.println("Informe o comprimento do terreno:");
        int c = input.nextInt();
        int area = (c*l);
        System.out.println("O terreno " +l+"x"+c + " tem "+ area + " metros quadrados");
        
    }

}
