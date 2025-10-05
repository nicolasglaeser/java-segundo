import java.util.Scanner;
class atividade8{

     public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);

        System.out.print("Digite o valor do relogio de agua dia 1°: ");
        double resultadoInicial = scaneer.nextDouble();
        System.out.print("Digite o valor do relogio de agua dia 30°: ");
        double resultadoFinal = scaneer.nextDouble();

        double totalConsumido = resultadoFinal - resultadoInicial;
        double resultado = totalConsumido / 30;

        System.out.println("Total de litros consumidos: " + totalConsumido);
        System.out.println("Media de consumo por litros: " + resultado + " litros");

     }
}