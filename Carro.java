import 'Modelo.java';

 class Carro {
    
    // Método para andar
    public void Andar() {
        System.out.println("Estou andando");
    }
    
    // Método para parar o carro
    public void Parar() {
        System.out.println("Estou andando");
    }
    
    // Método para testar a metode de outra classe
    public static void main(String[] args) {
        
        // Criar uma instância da classe Exemplo
        Modelo modelo = new Modelo();
    
        // Chamar o método imprimirMensagem
        modelo.imprimirMensagem();
    
    }
}