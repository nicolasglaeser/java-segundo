import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);

        System.out.print("Digite seu Primeiro Numero: ");
        double num1 = scaneer.nextDouble();

        System.out.print("Digite seu Segundo Numero: ");
        double num2 = scaneer.nextDouble();

        System.out.println("Resultado soma: " + (num1 + num2));
        System.out.println("Resultado subtracao: " + (num1 - num2));
        System.out.println("Resultado multiplicacao: " + (num1 * num2));
        System.out.println("Resultado divisao: " + (num1 / num2));


    }
}
