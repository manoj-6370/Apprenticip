package com.aprentiship_cell.dto;

import lombok.Data;

@Data
public class DivisionDTO {

	private int divId;
	private String divName;

	private DivisionDTO divHdName;
	private int isActive;
}
