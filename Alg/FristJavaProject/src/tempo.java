import java.util.Scanner;

    
    public class tempo {
      public static void main(String[] args)  throws Exception {
            Scanner input= new Scanner(System.in);

             int time; // le os segundos
            System.out.println("Enter industrial process time: "); // read the iput value
            time = input.nextInt(); // reads the time
            System.out.print("Tempo em segundos: " + time);

    }   
}
