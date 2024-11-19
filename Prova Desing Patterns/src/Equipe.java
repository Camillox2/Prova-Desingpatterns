public class Equipe implements Observer {
    public String nome;

    public Equipe(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String produto, int quantidade) {
        System.out.println("Equipe " + nome + " notificada: Produto " + produto + " Nova quantidade " + quantidade);
    }
}
