package com.aprentiship_cell.repository;

import com.aprentiship_cell.entity.ApprenticeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenticeInfoRepository extends JpaRepository<ApprenticeInfo, Integer> {

}
