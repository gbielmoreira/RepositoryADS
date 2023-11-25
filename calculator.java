public class Calculadora {

    // Método para imprimir uma mensagem
    public void imprimirMensagem() {
        System.out.println("Este é um exemplo de classe em Java!");
    }

    // Método para calcular a multiplicação de dois números inteiros
    public int multiplicar(int num1, int num2) {
        return num1 * num2; // Realiza a multiplicação
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criar uma instância da classe Exemplo
        Exemplo exemplo = new Exemplo();

        // Chamar o método imprimirMensagem
        exemplo.imprimirMensagem();

        // Chamar o método multiplicar e imprimir o resultado
        int resultadoMultiplicacao = exemplo.multiplicar(6, 4);
        System.out.println("A multiplicação é: " + resultadoMultiplicacao);
    }
}
