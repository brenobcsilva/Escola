package com.example.escola.persistence.model.dto;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class AlunoDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    @ManyToOne
    private ProfessorDto professor;

    public AlunoDto() {
    }

    public AlunoDto(String nome, ProfessorDto professor) {
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

    public ProfessorDto getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorDto professor) {
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
