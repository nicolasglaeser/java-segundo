
import java.util.Scanner;

class atividade2{

    public static void main(String[] args) {
        
        Scanner scaneer = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scaneer.next();

        System.out.print("Digite sua Idade: ");
        String idade = scaneer.next();   
        
        System.out.print("Digite seu Gênero: ");
        String genero = scaneer.next();

        System.out.print("Digite sua Cor favorita: ");
        String cor = scaneer.next();

        System.out.print("Você pratica esportes?(Sim ou Não): ");
        String esporte = scaneer.next();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Genero: " + genero);
        System.out.println("Cor favorita: " + cor);
        System.out.println("pratica esportes: " + esporte);

    }

}