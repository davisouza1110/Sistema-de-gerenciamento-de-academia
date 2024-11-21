package main;

import enums.TipoPlano;
import model.*;
import service.AcademiaService;
import treinos.TreinoAlongamento;
import treinos.TreinoCardio;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
            // Serviço da academia
            AcademiaService academia = new AcademiaService();

            // Criação de planos
            Plano planoAnual = new Plano(TipoPlano.ANUAL);

            // Criação de alunos
            Aluno aluno1 = new Aluno("Pedro Davi", 20, planoAnual);
            Aluno aluno2 = new Aluno("Pedro Henrique", 20, planoAnual);

            // Adicionando treino aos alunos
            Treino treinoCardio = new TreinoCardio("Esteira", 30);
            Treino treinoAlongamento = new TreinoAlongamento("Posterior", 30);


            aluno1.setTreinos(List.of(treinoCardio));
            aluno2.setTreinos(List.of(treinoAlongamento));

            // Cadastrando alunos na academia
            academia.cadastrarAluno(aluno1);
            academia.cadastrarAluno(aluno2);

            // Criação e cadastro de funcionário
            Funcionario personal = new Funcionario("Lucas", "Personal Trainer");
            academia.cadastrarFuncionario(personal);

            // Listando alunos e funcionários
            academia.listarAlunos();
            academia.listarFuncionarios();

            // Realizando treino
            aluno1.realizarTreino();
            aluno2.realizarTreino();
        }
    }

