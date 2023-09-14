
import java.util.Arrays;

public class preprova {
    public static void main(String[] args) {
        int[] lista = { 5, 3, 8, 4, 2 };
        bubbleSort(lista);
        System.out.println(Arrays.toString(lista));
    }

    public static void bubbleSort(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
     public static void bubbleSort2(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
     public static void insertionSort1(int[] lista) {
        int n = lista.length;
        int i = 1;
        while(i<n){
            int j = i - 1;
            while(j>=0  && lista[j]>lista[j+1]){ // aux is igual to j+1, the same of i
                int aux = lista[j+1];
                lista[j+1] = lista[j];
                lista[j] = aux;
                j--;
            }
            i++;
        }
    }    
}
