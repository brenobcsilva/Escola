package com.example.escola.persistence.model.dto;

import com.example.escola.persistence.model.Materia;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class ProfessorDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private Materia materia;
    @OneToMany
    private List<AlunoDto> alunos;

    public ProfessorDto() {
    }

    public ProfessorDto(String nome, Materia materia, List<AlunoDto> alunos) {
        this.nome = nome;
        this.materia = materia;
        this.alunos = alunos;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "ProfessorDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", materia=" + materia +
                '}';
    }
}
