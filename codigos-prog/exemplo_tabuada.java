
import java.util.Scanner;

public class exemplo_tabuada {
    public static void main(String[] args) {
        




    int num;
    Scanner s = new Scanner(System.in);

    System.out.print("Informe um numero para calcular a tabuada: ");
    num = s.nextInt();

    for(int i = 1; i<=10; i++){
        System.out.println(num + " X " + i + " = " + (num*i));
    }
    }
}
