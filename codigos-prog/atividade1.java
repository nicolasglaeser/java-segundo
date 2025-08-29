import java.util.Scanner;

public class atividade1 {
    
    public static void main(String[] args) {
        
        double nota_final;
        Scanner s = new Scanner(System.in);

        System.out.print("informa sua nota final: ");
        nota_final = s.nextDouble();

        if(nota_final < 6  && nota_final > 4) {
            System.out.println("precisa faser prova substitutiva");
        } else if ( nota_final >= 6) { 
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
