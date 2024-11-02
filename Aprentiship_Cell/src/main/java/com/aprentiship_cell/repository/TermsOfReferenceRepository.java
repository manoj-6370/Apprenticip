package com.aprentiship_cell.repository;

import com.aprentiship_cell.entity.TermsOfReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsOfReferenceRepository extends JpaRepository <TermsOfReference, Integer> {

}