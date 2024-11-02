package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(unique = true)
	private int empPcNo;
	private String empName;
	@ManyToOne
	private Designation empDesig;
	private int isActive;
}