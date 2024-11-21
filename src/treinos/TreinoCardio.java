package treinos;

import model.Treino;

public class TreinoCardio extends Treino {
    public TreinoCardio(String nome, int duracao) {
        super(nome, duracao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Treino Cardio: " + getNome() + " - Duração: " + getDuracao() + " minutos.");
    }
}
