import java.util;

public class lista2bim_60009945_nicolas_glaeser {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opc;

        do {
            System.out.println("\n===== MENU DE EXERCÍCIOS (A - O) =====");
            System.out.print("Digite a letra do exercício ou S para sair: ");
            opc = sc.next().toUpperCase();

            switch (opc) {
                case "A": exercicioA(); break;
                case "B": exercicioB(); break;
                case "C": exercicioC(); break;
                case "D": exercicioD(); break;
                case "E": exercicioE(); break;
                case "F": exercicioF(); break;
                case "G": exercicioG(); break;
                case "H": exercicioH(); break;
                case "I": exercicioI(); break;
                case "J": exercicioJ(); break;
                case "K": exercicioK(); break;
                case "L": exercicioL(); break;
                case "M": exercicioM(); break;
                case "N": exercicioN(); break;
                case "O": exercicioO(); break;
                case "S": break;
                default: System.out.println("Opção inválida.");
            }

        } while (!opc.equals("S"));
    }

    public static void exercicioA() {
        System.out.print("Digite três inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(ordenar_inteiros(a, b, c));
    }

    public static String ordenar_inteiros(int a, int b, int c) {
        int[] v = {a, b, c};
        Arrays.sort(v);
        return "Números em ordem crescente: " + v[0] + ", " + v[1] + ", " + v[2] + ".";
    }

    public static void exercicioB() {
        String[][] mat = {{"A", "B"}, {"C", "D"}};
        imprime_vetor_string(mat);
    }

    public static void imprime_vetor_string(String[][] m) {
        for (String[] linha : m) {
            for (String e : linha)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void exercicioC() {
        int[] v = {5, 3, 8, 1};
        int[] ord = ordena_vetor(v);
        System.out.println("Vetor ordenado:");
        for (int x : ord) System.out.print(x + " ");
    }

    public static int[] ordena_vetor(int[] v) {
        Arrays.sort(v);
        return v;
    }

    public static void exercicioD() {
        int[][] m = {{1,2,3},{4,5,6}};
        somaLinhas(m);
    }

    public static void somaLinhas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int soma = 0;
            for (int j = 0; j < m[i].length; j++) soma += m[i][j];
            System.out.println("Soma linha " + i + ": " + soma);
        }
    }

    public static void exercicioE() {
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Ano nascimento: ");
        int ano = sc.nextInt();

        System.out.println(transformaNome(nome, ano));
    }

    public static String transformaNome(String nome, int ano) {
        boolean primo = isPrimo(ano);
        if (primo) {
            return nome.replace("A","@").replace("a","@")
                       .replace("E","!").replace("e","!");
        } else {
            return nome.replace("E","#").replace("e","#")
                       .replace("O","").replace("o","");
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void exercicioF() {
        String[][] alunos = {
            {"Maria Silva", "123"},
            {"João Souza", "456"},
            {"Carlos Mota", "789"}
        };

        sc.nextLine();
        System.out.print("Digite parte do nome para busca: ");
        String texto = sc.nextLine();

        String[][] encontrados = busca_aluno(alunos, texto);
        imprime_vetor_string(encontrados);
    }

    public static String[][] busca_aluno(String[][] m, String texto) {
        ArrayList<String[]> lista = new ArrayList<>();

        for (String[] linha : m) {
            if (linha[0].toLowerCase().contains(texto.toLowerCase()))
                lista.add(linha);
        }
        return lista.toArray(new String[0][0]);
    }

    public static void exercicioG() {
        int[] v1 = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] v2 = {2, 4, 5, 8, 10, 2, 7, 5};
        double[] v3 = new double[8];

        for (int i = 0; i < 8; i++)
            v3[i] = dividir(v1[i], v2[i]);

        System.out.println("Resultado das divisões:");
        for (double d : v3) System.out.print(d + " ");
    }

    public static double dividir(double a, double b) {
        if (b == 0) return 0;
        return a / b;
    }

    public static void exercicioH() {
        int[] v = new int[50];
        Random r = new Random();

        for (int i = 0; i < 50; i++)
            v[i] = 1 + r.nextInt(100);

        System.out.print("Digite um número para buscar: ");
        int n = sc.nextInt();

        boolean achou = false;
        for (int x : v) if (x == n) achou = true;

        System.out.println(achou ? "Está presente" : "Não está presente");
    }

    public static void exercicioI() {
        int[][] m = new int[3][4];

        System.out.println("Digite os valores da matriz 3x4:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = sc.nextInt();

        somaLinhas(m);
    }

    public static void exercicioJ() {
        double[][] m = new double[5][4];
        Random r = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = r.nextDouble() * 10;

        for (double[] linha : m) {
            for (double x : linha)
                System.out.printf("%.2f ", x);
            System.out.println();
        }
    }

    public static void exercicioK() {
        System.out.print("Digite o mês (1-12): ");
        int mes = sc.nextInt();
        System.out.print("1 = Nome, 2 = Abreviação: ");
        int tipo = sc.nextInt();

        System.out.println(converteMes(mes, tipo));
    }

    public static String converteMes(int mes, int tipo) {
        String[] nomes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                          "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        String[] abrev = {"Jan","Fev","Mar","Abr","Mai","Jun",
                          "Jul","Ago","Set","Out","Nov","Dez"};

        if (mes < 1 || mes > 12) return "Mês inválido.";

        return (tipo == 1 ? nomes[mes-1] : abrev[mes-1]);
    }

    public static void exercicioL() {
        sc.nextLine();
        System.out.print("Descrição do produto: ");
        String desc = sc.nextLine();

        System.out.print("Preço bruto: ");
        double bruto = sc.nextDouble();

        System.out.print("Percentual de desconto: ");
        double perc = sc.nextDouble();

        double liquido = bruto - (bruto * (perc / 100));

        System.out.println("Descrição: " + desc);
        System.out.println("Preço bruto: " + bruto);
        System.out.println("Desconto: " + perc + "%");
        System.out.println("Preço líquido: " + liquido);
    }

    public static void exercicioM() {
        String[][] pedidos = {
            {"101","Ana","Vermelho","Branco","Preto"},
            {"102","Maria","Azul","Cinza","Rosa"},
            {"103","Clara","Verde","Branco","Amarelo"}
        };

        System.out.print("Digite número do pedido: ");
        String cod = sc.next();

        String[] res = buscaPedido(pedidos, cod);

        if (res == null)
            System.out.println("Pedido não encontrado.");
        else {
            System.out.println("Pedido: " + res[0]);
            System.out.println("Cliente: " + res[1]);
            System.out.println("Cor principal: " + res[2]);
            System.out.println("Cor secundária: " + res[3]);
            System.out.println("Cor complementar: " + res[4]);
        }
    }

    public static String[] buscaPedido(String[][] m, String cod) {
        for (String[] linha : m)
            if (linha[0].equals(cod))
                return linha;
        return null;
    }

    public static void exercicioN() {
        System.out.print("Dividendo: ");
        double a = sc.nextDouble();
        System.out.print("Divisor: ");
        double b = sc.nextDouble();

        System.out.println("Resultado = " + divisao(a, b));
    }

    public static double divisao(double a, double b) {
        if (b == 0) return 0;
        return a / b;
    }

    public static void exercicioO() {
        int[] v = new int[5];
        preencher(v);
        ordenar(v);
        exibir(v);
    }

    public static void preencher(int[] v) {
        for (int i = 0; i < v.length; i++) v[i] = (i+1)*10;
    }

    public static int[] ordenar(int[] v) {
        Arrays.sort(v);
        return v;
    }

    public static void exibir(int[] v) {
        for (int x : v) System.out.print(x + " ");
    }
}