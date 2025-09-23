
import java.util.Scanner;

public class aula4 {
    
    public static void main(String[] args) {
    
        int A, B, C;
        String msg="";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo para calcular o tipo de um triangulo");
        System.out.print("Informe o primeiro lado: ");
        lado_A = scanner.nextInt()
        System.out.print("Informe o segundo lado: ");
        lado_B = scanner.nextInt()
        System.out.print("Informe o terceiro lado: ");
        lado_C = scanner.nextInt()

        if (lado_A < lado_B+lado_C && lado_B < lado_A+lado_C && lado_C < lado_A+lado_B) {
            if (lado_A == lado_B && lado_B == lado_C){
                msg = "É um triangulo Equilatero!"
            }else if (lado_A != lado_B && lado_B != lado_C){

            }else

        }else{
            msg = "Não é um triangulo";
        }

        System.out.println("Resultado; " + msg);

    }
}
