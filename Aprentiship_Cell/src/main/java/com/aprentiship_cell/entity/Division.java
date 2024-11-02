package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Division {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int divId;
	private String divName;
	
	@OneToOne
	private Division divHdName;
	private int isActive;
	
}
