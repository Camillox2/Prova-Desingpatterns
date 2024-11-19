public class SistemaAnalise implements Observer {
    public String nome;

    public SistemaAnalise(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String produto, int quantidade) {
        System.out.println("[" + nome + "] Notificação: O produto " + produto + " agora possui a quantidade: " + quantidade);
    }
}
