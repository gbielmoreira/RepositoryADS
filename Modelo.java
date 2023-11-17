import javax.management.openmbean.OpenDataException;

public class Modelo {
    
    // Método para imprimir uma mensagem
public void imprimirMensagem() {
    System.out.println("E ai, este é outro exemplo de classe em Java!");
}

// Método para calcular a divisão de dois números inteiros
public int somar(int num1, int num2) {
    return x / y;
}

// Método main para testar a classe
public static void main(String[] args) {
    // Criar uma instância da classe Exemplo
    Modelo modelo = new Modelo();

    // Chamar o método imprimirMensagem
    modelo.imprimirMensagem();

    // Chamar o método somar e imprimir o resultado
    int resultadoDiv = modelo.somar(5, 3);
    System.out.println("A divisão é: " + resultadoDiv);
}
}
