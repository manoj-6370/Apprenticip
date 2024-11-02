package com.aprentiship_cell.service;

import com.aprentiship_cell.entity.ApprenticeReport;

import java.util.List;

public interface ApprenticeReportService {
	
	public void addApprenticeReport(ApprenticeReport ar);
	
	public void editApprenticeReport(ApprenticeReport ar);
	
	public void deleteApprenticeReport(int id);
	
	public List<ApprenticeReport> fetchApprenticeReport();
}
