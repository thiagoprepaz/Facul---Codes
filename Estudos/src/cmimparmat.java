import java.util.Scanner;


public class cmimparmat {
    /*
     * 2.Função para somar números pares ou ímpares em uma matriz: dê
     * o nome que deseja a função, ela deve recebe como parâmetro de
     * entrada: uma matriz de inteiros e uma variável booleana. A variável
     * booleana irá indicar se você deve somar os números pares ou os
     * números ímpares da matriz. Se ela estiver em True então você deve
     * somar os números pares, se estiver em False, então você deve somar o
     * números ímpares. Essa soma é o que deve ser retornada.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCols, numRows, aux;
        int pares[] = new int[50];
        Boolean op;

        System.out.println("What is the cols lenght?");
        numCols = input.nextInt(); // read the vector length

        System.out.println("What is the rows lenght?");
        numRows = input.nextInt(); // read the vector length

        int[][] matriz = new int[numCols][numRows];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriz lida:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Digite 1 para somar os numeros pares e 2 para somar os numeros impares");
        aux = input.nextInt(); // read te type of operation
        if (aux == 1)
            op = true;
        else
            op = false;

        // somar os numeros pares
        int smt=0;
        if (op == true) {
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    if (matriz[i][j] % 2 == 0) {
                        pares[i * numCols + j] = matriz[i][j];
                        smt = smt + pares[i];
                    }
                }
            }
            System.out.println(smt);
        }
        
        
    }
}

// variable boolean que vai determinar se soma os pares ou os impares

// funcao que vai receber os parametros(mt + boolean)
// True-> soma pares. False-> soma impares
// retorna soma
