package com.aprentiship_cell.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TermsOfReference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ToRId;
	private String ToRName;
	private int isActive;
}