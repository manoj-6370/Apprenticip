package com.aprentiship_cell.repository;

import com.aprentiship_cell.entity.GeneralInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralInstructionRepository extends JpaRepository<GeneralInstruction, Integer> {
}