import java.util.Scanner;

public class atividade6 {
    
            public static void main(String[] args) {

         Scanner scaneer = new Scanner(System.in);

         System.out.print("Digite seu Numero: ");
         int number = scaneer.nextInt();

         Double resultado1;
         Double resultado2;
         Double resultado3;
         Double resultado4;
         Double resultado5;

         resultado1 = Math.pow(number ,2);
         System.out.println(resultado1);

         resultado2 = Math.pow(number , 4);
         System.out.println(resultado2);

         resultado3 = Math.pow(number , 6);
         System.out.println(resultado3);

         resultado4 = Math.pow(number , 8);
         System.out.println(resultado4);

         resultado5 = Math.pow(number , 10);
         System.out.println(resultado5);
       
}

}
