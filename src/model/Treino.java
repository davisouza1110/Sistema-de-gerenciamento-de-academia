package model;

public abstract class Treino {
    private String nome;
    private int duracao;

    public Treino(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public abstract void exibirDetalhes();
}
