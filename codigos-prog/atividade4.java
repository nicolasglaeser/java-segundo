import java.util.Scanner;

public class atividade4 {
    
    public static void main(String[] args) {

         Scanner scaneer = new Scanner(System.in);

         System.out.print("Digite seu Primeiro Numero: ");
        int num1 = scaneer.nextInt();

        System.out.print("Digite seu Segundo Numero: ");
        int num2 = scaneer.nextInt();
        
        if (num1> num2) {
            System.out.println("O Primeiro Numero é Maior.");
        } else if (num1 < num2) {
            System.out.println("O Primeiro Numero é Menor.");
        } else {
            System.out.println("Os Numeros são Iguais.");
        } 

}
}