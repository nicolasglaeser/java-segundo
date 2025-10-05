import java.util.Scanner;

class atividade7{

     public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = scaneer.nextDouble();
        System.out.print("Digite outro numero: ");
        double num2 = scaneer.nextDouble();

        System.out.println(num1 > num2);
        System.out.println (num1 < num2);
        System.out.println (num1 == num2);
        System.out.println (num1 != num2);
     }
}