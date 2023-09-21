package Lista3;

import java.util.Scanner;
import java.lang.Math;

public class gerenteloja {
    /*
     * Faça um programa em Java onde o gerente de um supermercado pode informar o
     * nome de um produto, o preço de custo desse produto e a porcentagem de lucro
     * que ele deseja colocar no produto. O programa deve ao final imprimir os dados
     * informados do produto e qual será o preço de venda com a porcentagem de lucro
     * já atribuída ao preço de custo.
     * 
     * Exemplo de entrada:
     * 
     * Qual o nome do produto? Detergente
     * Qual o preço de custo do produto? 1,4
     * Qual a porcentagem de lucro? 30
     * A saída esperada deverá ser:
     * 
     * O Detergente que tem preço de custo de 1,4 deve ser vendido por 2 reais.
     * 
     * OBS: perceba que 70% de 2 reais é 1,4 reais
     */
    public static void main(String[] args) {
        double precfinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String name = input.next();

        System.out.println("Qual o preço de custo do produto?");
        Double price = input.nextDouble();

        System.out.println("Qual a porcentagem de lucro?");
        Double profit = input.nextDouble();

        precfinal = (price * (profit / 100) + price);

        System.out.println("O "+ name +" que tem preço de custo de " + price + " deve ser vendido por " + (Math.round(precfinal)) + " reais.");

    }
}
