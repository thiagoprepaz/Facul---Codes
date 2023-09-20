package Lista3;

import java.util.Scanner;

public class temp {
    /*
     * Faça um programa em Java que leia o grau de temperatura em Celsius (C) e
     * imprima a sua conversão em Fahrenheit (F) e Kelvin (K). Considere que
     * 
     * F = C x 1,8 + 32
     * K=C+273
     * 
     * 
     * Exemplo de entrada:
     * o Informe o grau de temperatura em Celsius: 39
     * 
     * Saída esperada:
     * o 39 graus Celsius equivale a 102,2 graus Fahrenheit e 312 graus Kelvin
     * 
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o grau de temperatura em Celsius");
        int c = input.nextInt();
        double f = (c * 1.8) + 32;
        int k = (c + 273);
        System.out.println(c + " graus Celsius equivale a " + f + " graus Fahrenheit e " + k + " graus Kelvin ");
    }

}
