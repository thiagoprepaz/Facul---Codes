public class array {
    //lendo um array com for

     public static void main(String[] args) {
        
    
    int[] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;

    for(int i = array.length-1; i>=0;i=i-1){
        System.out.printf("%d%n", array[i]);
     }
    }
}
