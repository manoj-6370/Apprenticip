package com.aprentiship_cell.repository;

import com.aprentiship_cell.entity.ApprenticeReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenticeReportRepository extends JpaRepository<ApprenticeReport, Integer> {

}
