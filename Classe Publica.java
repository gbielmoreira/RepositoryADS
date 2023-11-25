 public class Calculadora {

    // Método para imprimir uma mensagem
    public void imprimirMensagem() {
        System.out.println("Olá, este é um exemplo de classe em Java!");
    }

    // Método para calcular a soma de dois números inteiros
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criar uma instância da classe Exemplo
        Exemplo exemplo = new Exemplo();

        // Chamar o método imprimirMensagem
        exemplo.imprimirMensagem();

        // Chamar o método somar e imprimir o resultado
        int resultadoSoma = exemplo.somar(5, 3);
        System.out.println("A soma é: " + resultadoSoma);
    }
}
