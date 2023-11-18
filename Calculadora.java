public class Calculadora {

    // Método para imprimir uma mensagem
    public void imprimirMensagem() {
        System.out.println("Este é um exemplo de calculadora em Java");
    }

    // Método para calcular a subtração de dois números inteiros
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }
  
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.imprimirMensagem();

        // Chamar o método subtrair e imprimir o resultado
        int resultadoSubtracao = calculadora.subtrair(8, 3);
        System.out.println("A subtração é: " + resultadoSubtracao);
    }
}
