package examesuficiencia;

import java.util.Scanner;

public class quest1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = -1, N = 0;

        while (a < 0 || a == 0) {
            System.out.println("Digite N");
            a = input.nextInt();
        }
        N = a;

        int vetor[] = new int[N];

        int i = 0;
        while (i < N) {
            System.out.print("Informe o " + (i + 1) + "º " + "elemento do vetor:");
            vetor[i] = input.nextInt();
            i++;
        }
        encontreRepeticoes(vetor);

    }

    public static int[] encontreRepeticoes(int[] vetor) {
        int[] repetidos = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j + 1]) {
                    repetidos[i] += 1;
                }
            }
            System.out.print("Elemento" + (i) + "se repitiu" + (repetidos[i]));
        }
        return repetidos;
    }

    public static void encontreMaiorMenorRepeticoes(int[] vetor) {
            //quantas vezes cada um se repete?, como fazer isso?
    }

}
