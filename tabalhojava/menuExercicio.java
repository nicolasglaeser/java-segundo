import java.util.Scanner;

public class exercicio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nEscolha um exercício (1-9) ou 0 para sair:");
            System.out.println("1 - Comparar dois números");
            System.out.println("2 - Verificar par ou ímpar");
            System.out.println("3 - Calcular consumo de água");
            System.out.println("4 - Potência ou raiz quadrada");
            System.out.println("5 - Verificar triângulo");
            System.out.println("6 - Calcular peso ideal");
            System.out.println("7 - Idade para votar e habilitação");
            System.out.println("8 - Categoria de nadador");
            System.out.println("9 - Soma de números pares");
            System.out.println("10 - Jogo de adivinhação com dicas");
            System.out.println("11 - Adivinhação simples (10-29)");
            System.out.println("12 - Ordenar três números");
            System.out.println("13 - Contar vogais e consoantes");
            System.out.println("14 - Validador de senha");
            System.out.println("15 - Função cálculo condicional");

            System.out.print("Digite sua escolha: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    atividade1();
                    break;
                case 2:
                atividade2();
                    break;
                case 3:
                atividade3();
                    break;
                case 4:
                atividade4();
                    break;
                case 5:
                atividade5();
                    break;
                case 6:
                    atividade6();
                    break;
                case 7:
                    atividade7();
                    break;
                case 8:
                    atividade8();
                    break;
                case 9:
                    atividade9();
                case 10:
                    atividade10();
                case 11:
                    atividade11();
                case 12:
                    atividade12();
                case 13:
                    atividade13();
                case 14:
                    atividade14();
                case 15:
                    atividade15();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente.");
            }
        } while (choice != 0);
    }

    public static void atividade1 {
    
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

    public static void atividade2() {

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

public static void atividade3() {

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

public static void atividade4() {

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

public static void atividade5() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite os três lados A, B e C: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            System.out.println("triângulo equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("triângulo isósceles");
        } else {
            System.out.println("triângulo escaleno");
        }
    } else {
        System.out.println("não compõem um triângulo");
    }
}

public static void atividade6() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a altura (em metros): ");
    double altura = scanner.nextDouble();
    System.out.print("Digite o peso atual: ");
    double peso = scanner.nextDouble();
    scanner.nextLine(); // Clear buffer
    System.out.print("Digite o sexo (M/F): ");
    String sex = scanner.nextLine().toUpperCase();
    double pesoIdeal;
    if (sex.equals("M")) {
        pesoIdeal = (72.7 * altura) - 58;
    } else if (sex.equals("F")) {
        pesoIdeal = (62.1 * altura) - 44.7;
    } else {
        System.out.println("Sexo inválido!");
        return;
    }
    if (peso < pesoIdeal) {
        System.out.println("abaixo do peso");
    } else if (peso == pesoIdeal) {
        System.out.println("no peso ideal");
    } else {
        System.out.println("acima do peso ideal");
    }
}

public static void atividade7() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o ano de nascimento: ");
    int anoAniversario = scanner.nextInt();
    int age = idade - anoAniversario;
    if (age >= 18) {
        System.out.println("já tem idade para votar e tirar habilitação");
    } else if (age >= 16) {
        System.out.println("já tem idade para votar");
    } else {
        System.out.println("menor de 16 anos: não pode nem votar nem tirar carteira");
    }
}

public static void atividade8() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a idade do nadador: ");
    int idade = scanner.nextInt();
    String categoria;
    if (idade >= 5 && idade <= 7) {
        categoria = "Infantil A";
    } else if (idade >= 8 && idade <= 10) {
        categoria = "Infantil B";
    } else if (idade >= 11 && idade <= 13) {
        categoria = "Juvenil A";
    } else if (idade >= 14 && idade <= 17) {
        categoria = "Juvenil B";
    } else if (idade >= 18) {
        categoria = "Adulto";
    } else {
        categoria = "Idade inválida";
    }
    System.out.println("Categoria: " + categoria);
}

public static void atividade9() {
    Scanner scanner = new Scanner(System.out.in);
    int suma = 0;
    System.out.println("Digite números (0 para encerrar): ");
    int num;
    do {
        num = scanner.nextInt();
        if (num % 2 == 0 && num != 0) {
            suma += num;
        }
    } while (num != 0);
    System.out.println("Soma dos números pares: " + suma);
}

public static void atividade10() {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int secreto = rand.nextInt(101); // 0-100
    int adivinhar;
    System.out.println("Adivinhe o número (1-100): ");
    do {
        adivinhar = scanner.nextInt();
        if (adivinhar > secreto) {
            System.out.println("Chute alto!");
        } else if (adivinhar < secreto) {
            System.out.println("Chute baixo!");
        } else {
            System.out.println("Parabéns! Você acertou!");
            break;
        }
    } while (true);
}

public static void atividade11() {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Digite um número entre 10 e 29 (9 para sair): ");
    int userNum;
    do {
        userNum = scanner.nextInt();
        if (userNum == 9) {
            break;
        }
        int randomNum = rand.nextInt(20) + 10; // 10-29
        if (userNum == randomNum) {
            System.out.println("PARABÉNS! Você acertou!");
        } else {
            System.out.println("QUE PENA. Não foi desta vez. Tente novamente!");
        }
    } while (true);
}

public static void atividade12() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite três números inteiros: ");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    scanner.nextLine(); // Clear buffer
    System.out.print("Ordem (C para crescente, D para decrescente): ");
    String order = scanner.nextLine().toUpperCase();
    int[] nums =       System.out.println("Ordem inválida!");
    }
}

public static void atividade13() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String word = scanner.nextLine().toLowerCase();
    int vowels = 0;
    int consonants = 0;
    for (char ch : word.toCharArray()) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
        } else if (ch >= 'a' && ch <= 'z' && ch != ' ') {
            consonants++;
        }
    }
    System.out.println("Número de vogais: " + vowels);
    System.out.println("Número de consoantes: " + consonants);
}

public static void atividade14() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a senha: ");
    String password = scanner.nextLine();
    System.out.print("Digite o nome: ");
    String name = scanner.nextLine();
    System.out.print("Digite o sobrenome: ");
    String surname = scanner.nextLine();
    boolean valid = true;
    // Min 8 chars
    if (password.length() < 8) {
        valid = false;
    }
    // Contains @ ! or #
    if (!password.contains("@") && !password.contains("!") && !password.contains("#")) {
        valid = false;
    }
    // First char not first of name or surname
    if (password.length() > 0 && (password.charAt(0) == name.charAt(0) || password.charAt(0) == surname.charAt(0))) {
        valid = false;
    }
    // Not contains full name or surname
    if (password.contains(name) || password.contains(surname)) {
        valid = false;
    }
    if (valid) {
        System.out.println("Atende critérios");
    } else {
        System.out.println("Não atende Critérios");
    }
}

public static void atividade15() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite num1: ");
    double num1 = scanner.nextDouble();
    System.out.print("Digite num2: ");
    double num2 = scanner.nextDouble();
    double result = calculo(num1, num2);
    if (num1 > num2) {
        System.out.println("num1 maior que num2. Resultado da multiplicação: " + result);
    } else if (num1 < num2) {
        System.out.println("num1 menor que num2. Resultado da divisão: " + result);
    } else {
        System.out.println("num1 igual a num2. Resultado da soma: " + result);
    }
}
