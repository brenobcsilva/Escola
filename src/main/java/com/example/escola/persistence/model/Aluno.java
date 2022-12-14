package com.example.escola.persistence.model;

import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private Professor professor;

    public Aluno(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor=" + professor +
                '}';
    }
}
