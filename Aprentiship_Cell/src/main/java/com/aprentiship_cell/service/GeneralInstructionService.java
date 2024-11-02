package com.aprentiship_cell.service;

import com.aprentiship_cell.dto.ApprenticeInfoDTO;
import com.aprentiship_cell.dto.GeneralInstructionDTO;

import java.util.List;

public interface GeneralInstructionService {
	public GeneralInstructionDTO creteGeneralInstructionDTO(GeneralInstructionDTO generalInstructionDTO);
	public GeneralInstructionDTO getGeneralInstructionDTO(int id);
	public List<GeneralInstructionDTO> getAllGeneralInstructionDTO();
	public GeneralInstructionDTO updateGeneralInstructionDTO(int id, GeneralInstructionDTO generalInstructionDTO);
	public Boolean deleteGeneralInstructionDTO(int id);
}