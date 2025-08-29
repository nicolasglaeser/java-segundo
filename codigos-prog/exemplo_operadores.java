class exemplo_operadores{

    public static void main(String[] args) {
        
    int A; 
    int B;
    
    int soma;
    int subtracao;
    int multiplicacao;
    double divisao;
    double resto_divisao;

    A = 10;
    B = 5;

    soma = A + B;
    subtracao = A - B;
    multiplicacao = A * B;
    divisao = A / B;
    resto_divisao = A % B;

        System.out.println("Resultado soma: " + soma);
        System.out.println("Resultado subtracao: " + subtracao);
        System.out.println("Resultado multiplicacao: " + multiplicacao);
        System.out.println("Resultado divisao: " + divisao);
        System.out.println("Resultado resto_divisao: " + resto_divisao);

        System.out.println("Resultado dasoperacoes Relacionais entre A e B: ");
        System.out.println("A < B: " + (A<B));
    }

}