public class Main {
    public static void main(String[] args) {
        
        Produto produto0 = new Produto("Produto A", 100);

       
        Observer sistemaAnalise1 = new SistemaAnalise("Sistema de Análise 0");
        Observer equipe1 = new Equipe("Equipe Alfa");
        
        produto0.adicionarObservador(sistemaAnalise1);
        produto0.adicionarObservador(equipe1);

        
        produto0.setQuantidade(1000);

        
        Observer equipe2 = new Equipe("Equipe Omega");
        produto0.adicionarObservador(equipe2);

        
        produto0.setQuantidade(100);

        
        produto0.removerObservador(equipe1);

        
        produto0.setQuantidade(50);
    }
}
