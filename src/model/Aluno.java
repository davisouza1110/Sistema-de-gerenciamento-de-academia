package model;

import java.util.List;

public class Aluno {
    private String nome;
    private int idade;
    private Plano plano;
    private List<Treino> treinos;

    public Aluno(String nome, int idade, Plano plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    public void realizarTreino() {
        System.out.println(nome + " está realizando seus treinos:");
        for (Treino treino : treinos) {
            treino.exibirDetalhes();
        }
    }

    @Override
    public String toString() {
        return "model.Aluno{nome='" + nome + "', idade=" + idade + ", plano=" + plano.getTipoPlano() + '}';
    }
}
