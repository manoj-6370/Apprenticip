package com.aprentiship_cell.dto;

import lombok.Data;

@Data
public class ApprenticeReportDTO {

	private int aprRepId;

	private ApprenticeInfoDTO aprName;
	private String aprQualification;
	private String aprStream;

	private DivisionDTO aprDiv;
	private int intTel;
	private String WA;
	private String WCO;
	private int isActive;
}
