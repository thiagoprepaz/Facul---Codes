import java.util.Scanner;

public class multilista {

    // Le um double e uma lista int, multiplica e retorna

    /*
     * 1.Função para multiplicar uma lista por um número: dê o nome que
     * deseja a função, ela deve recebe como parâmetro de entrada: uma lista
     * de inteiro e um número real qualquer. A função deve retornar a lista
     * multiplicada por esse número.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        double number;

        System.out.println("What is the vector lenght?");
        x = input.nextInt(); // read the vector length
        int[] numero = new int[x]; // a vetor is an object, so it needs to be instantiated

        System.out.println("What is the times number");
        number = input.nextDouble(); // read the vector length

        for (int i = 0; i < x; i++) {
            numero[i] = input.nextInt();

        }
        double[] b = mult(numero, number);

        for (int i = 0; i < x; i++) {
            System.out.println(b[i]);

        }
    }

    public static double[] mult(int[] b, double a) {
        int tamanho = b.length;
        double[] result = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            result[i] = b[i] * a;
        }

        return result;

    }
}
