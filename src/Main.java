public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        // Adicionando várias formas com cores diferentes
        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Verde", "1,2", 15);
        formaManager.addForma("Azul", "2,3", 20);

        // Reutilizando a cor "Vermelho" com posição e tamanho diferentes
        formaManager.addForma("Vermelho", "4,4", 25);
        formaManager.addForma("Verde", "5,5", 30);

        // Exibir todas as formas
        formaManager.apresentar();
    }
}
