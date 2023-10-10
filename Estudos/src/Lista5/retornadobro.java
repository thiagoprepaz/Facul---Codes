package Lista5;

import java.util.Scanner;

public class retornadobro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, x, a=1;

        // ler um n positivo, enquanto nao for positivo pedir um novo
        System.out.print("Informe um número positivo: ");
        n = input.nextInt();

        while (n < 0) {
            System.out.print("Informe um número positivo: ");
            n = input.nextInt();
        }

        // ler n vezes numeros inteiros e imprimir o dobro de cada lido
        while (n > 0) {
            System.out.print("Informe o número " + a + ": ");
            x = input.nextInt();
            System.out.println("O dobro de " + x + " é " + (x*2));
            a++;
            n--;
        }

    }
}
