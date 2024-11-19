import java.util.ArrayList;
import java.util.List;

public class Produto {
    public String nome;
    public int quantidade;
    public List<Observer> observers;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.observers = new ArrayList<>();
    }

    
    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    
    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        notificarObservadores();
    }

    // Notifica todos os observadores registrados sobre a mudança de quantidade
    private void notificarObservadores() {
        for (Observer observer : observers) {
            observer.atualizar(nome, quantidade);
        }
    }
}
