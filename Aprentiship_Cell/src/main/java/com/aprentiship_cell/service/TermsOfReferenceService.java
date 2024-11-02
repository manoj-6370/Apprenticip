package com.aprentiship_cell.service;

import com.aprentiship_cell.entity.TermsOfReference;

import java.util.List;

public interface TermsOfReferenceService {

	public void addTermsOfReference(TermsOfReference tor);
	
	public void editTermsOfReference(TermsOfReference tor);
	
	public void deleteTermsOfReference(int id);
	
	public List<TermsOfReference> fetchTermsOfReference();
}
