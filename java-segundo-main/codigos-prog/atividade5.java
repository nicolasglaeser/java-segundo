import java.util.Scanner;

public class atividade5 {
        public static void main(String[] args) {

         Scanner scaneer = new Scanner(System.in);

         System.out.print("Digite seu Numero: ");
         int number = scaneer.nextInt();

         if (number % 2 == 0) {
            System.out.println("O Numero é Par.");
        } else {
            System.out.println("O Numero é impar.");
        }
    }
}
