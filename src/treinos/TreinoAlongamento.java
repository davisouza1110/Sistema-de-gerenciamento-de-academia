package treinos;

import model.Treino;

public class TreinoAlongamento extends Treino {
    public TreinoAlongamento(String nome, int duracao){
        super(nome, duracao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Treino Alongamento: " + getNome() + " - Duração" + getDuracao() + " minutos. ");
    }
}
