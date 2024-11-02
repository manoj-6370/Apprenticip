package com.aprentiship_cell.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

	private int empId;

	private int empPcNo;
	private String empName;

	private DesignationDTO empDesig;
	private int isActive;
}