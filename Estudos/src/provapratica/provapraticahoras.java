package provapratica;

import java.util.Scanner;

public class provapraticahoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int defaultJaneiro = 31, defaultFevereiro = 28, defaultMarco = 31, defaultAbril = 30, defaultMaio = 31,
                defaultJunho = 30, defaultJulho = 31, defaultAgosto = 31, defaultSetembro = 30, defaultOutubro = 31,
                defaultNovembro = 30, defaultDezembro = 31;
        int parctime = 0;
        int otheryears = 0;

        System.out.println("Qual o dia do seu nascimento?(não digite o zero na frente)");
        int day = input.nextInt();
        System.out.println("Qual o mes do seu nascimento?(não digite o zero na frente)");
        int month = input.nextInt();
        System.out.println("Qual o ano do seu nascimento?");
        int year = input.nextInt();
        System.out.println("Qual o horário do seu nascimento?(somente horas cheias)");
        int hour = input.nextInt();

        if (month == 1) {
            parctime = (((31 - day) * 24) + ((defaultFevereiro + defaultMarco + defaultAbril + defaultMaio +
                    defaultJunho + defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 2) {
            parctime = (((28 - day) * 24) + ((defaultMarco + defaultAbril + defaultMaio +
                    defaultJunho + defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 3) {
            parctime = (((31 - day) * 24) + ((defaultAbril + defaultMaio +
                    defaultJunho + defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 4) {
            parctime = (((30 - day) * 24) + ((defaultMaio +
                    defaultJunho + defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 5) {
            parctime = (((31 - day) * 24)
                    + ((defaultJunho + defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                            defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 6) {
            parctime = (((30 - day) * 24) + ((defaultJulho + defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 7) {
            parctime = (((31 - day) * 24) + ((defaultAgosto + defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 8) {
            parctime = (((31 - day) * 24) + ((defaultSetembro + defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 9) {
            parctime = (((30 - day) * 24) + ((defaultOutubro +
                    defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 10) {
            parctime = (((31 - day) * 24) + ((defaultNovembro + defaultDezembro) * 24));
        }
        if (month == 11) {
            parctime = (((30 - day) * 24) + ((defaultDezembro) * 24));
        }
        if (month == 12) {
            parctime = (((30 - day) * 24));
        }

        otheryears = ((2020 - year)*8760) + (6517); // no  segundo prenteses esta sendo feito o caluclo de horas do ano de 2021

        int totaltime = ((24 - hour) + parctime + otheryears);
        System.out.println(totaltime);

    }
}
