package com.example.escola.persistence.repository;

import com.example.escola.persistence.model.Aluno;
import com.example.escola.persistence.model.Professor;
import com.example.escola.persistence.model.dto.ProfessorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorDto, UUID> {
}
