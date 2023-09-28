package provapratica;

import java.util.Scanner;

public class provapratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu nome:");
        String name = input.nextLine();

        System.out.print("Informe a sua idade:");
        int idade = input.nextInt();

        System.out.print("Informe o seu sexo:");
        String sexo = input.next();

        System.out.print("Informe o seu peso:");
        double peso = input.nextDouble();

        System.out.print("Informe a sua altura:");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        if ((sexo.equals("feminino") && peso >= 55 && idade >= 16 && idade <= 59 && imc >= 15 && imc <= 30)
                || (sexo.equals("masculino") && peso >= 50 && idade >= 15 && idade <= 69 && imc >= 20 && imc <= 35)) {
            System.out.println("Voce pode doar sangue");
        }
        else
        System.out.println("Voce não pode doar");
    }
}
