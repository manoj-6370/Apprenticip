package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PrimaryRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int primaryRoleId;
	
	private String primaryRoleName;
	
	@OneToMany
	private List<Employee> employeeId;
	
	private int isActive;
}
