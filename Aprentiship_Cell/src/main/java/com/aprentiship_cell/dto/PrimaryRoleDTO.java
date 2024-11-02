package com.aprentiship_cell.dto;

import lombok.Data;

import java.util.List;

@Data
public class PrimaryRoleDTO {

	private int primaryRoleId;
	
	private String primaryRoleName;

	private List<EmployeeDTO> employeeId;
	
	private int isActive;
}
