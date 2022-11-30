package com.example.escola.persistence.repository;

import com.example.escola.persistence.model.dto.AlunoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoDto, UUID> {
}
