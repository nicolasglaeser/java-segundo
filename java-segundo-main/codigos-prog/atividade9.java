import java.util.Scanner;

public class atividade9 {
    
    public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int number = scaneer.nextInt();
        if(number > 10 && number < 100) {
            double resultado = Math.pow(number, 2);
            System.out.printf(number + "^2 = %. 5f%n", resultado);
        }else { 
            double resultado = Math.sqrt(number);
            System.out.printf("Raiz quadrada de " + number + " = % .5f%n", resultado);
        }
    }
}
