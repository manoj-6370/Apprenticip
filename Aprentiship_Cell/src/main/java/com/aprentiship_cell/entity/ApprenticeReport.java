package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ApprenticeReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aprRepId;
	
	@OneToOne
	private ApprenticeInfo aprName;
	private String aprQualification;
	private String aprStream;
	
	@ManyToOne
	private Division aprDiv;
	private int intTel;
	private String WA;
	private String WCO;
	private int isActive;
}
