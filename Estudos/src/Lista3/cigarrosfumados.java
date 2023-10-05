package Lista3;

import java.util.Scanner;
import java.lang.Math; // I think it´s gona be used in the final print 

public class cigarrosfumados {
    /*
     * Faça um programa em Java que calcula a quantidade dinheiro gasta por um
     * fumante. O programa deve ler o nome do fumante, o número de anos que ele
     * fumou, o nº de cigarros fumados por dia e o preço de uma carteira com 20
     * cigarros. Considere que todos os meses possuem 30 dias.
     * 
     * · Exemplo de entrada:
     * 
     * o Qual o nome do fumante? João
     * 
     * o Quantos anos João fumou? 25
     * 
     * o Qual a quantidade média de cigarros por dia? 12
     * 
     * o Qual o preço médio de cada carteira? 2,67
     * 
     * · Saída esperada:
     * 
     * o João já gastou um total de 14.418 reais.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner object

        String name;
        int years, numparcial;
        double price, total;

        System.out.print("What's your name? ");
        name = input.nextLine();//read the smoker name

        System.out.print("How many years did you smoke? ");
        years = input.nextInt();//how many years he smoked(all the months are of 30 days)

        System.out.print("How many cigarettes did you smoke per day? ");
        numparcial = input.nextInt();//number of cigarettes per day

        System.out.print("What's the price of a cigarette pack? ");
        price = input.nextDouble();//price of a cigarette pack with 20 cigarettes

        total = ((((((years*12)*30)*numparcial))/20)*price);//calculo de dinheiro gasto

        System.out.println("O/A " + name + " gastou um total de " + total + "reais");
    }
}
