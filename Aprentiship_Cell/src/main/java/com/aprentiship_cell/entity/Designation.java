package com.aprentiship_cell.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Designation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int desigId;
	private String desigName;
	private int isActive;
}
