package examesuficiencia;

import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = 0, m = 0, s = 0, a = -1;

        while (a < 0 || a > 12) {
            System.out.println("Informe N positivo");
            a = input.nextInt();
        }
        h = a;
        a = -1;
        while (a < 0 || a > 59) {
            System.out.println("Informe N positivo");
            a = input.nextInt();
        }
        m = a;
        a = -1;
        while (a < 0 || a > 59) {
            System.out.println("Informe N positivo");
            a = input.nextInt();
        }
        s = a;

        int rastrer = 0;
        while (rastrer == 0) {
            System.out.println("Informe 1 para AM ou 2 para PM");
            a = input.nextInt();

            if (a == 2 && (h + s == 1 || h + s == 12)) {
                System.out.println("Formato informado incorreto, o horário correto é AM");
                rastrer = 1;
                // corrigir formato

            }
            if (a == 1 && (h + s == 13 || h + s == 00)) {
                System.out.println("Formato informado incorreto, o horário correto é PM, informe a opcao correta");
                while (a == 1) {
                    a = input.nextInt();
                // corrigir formato

            }

        }
    }

        /*
         * if()
         * h = h+11;
         */

    }
}
