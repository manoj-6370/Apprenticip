package com.aprentiship_cell.service;

import com.aprentiship_cell.dto.ApprenticeInfoDTO;

import java.util.List;

public interface ApprenticeInfoService {

	public ApprenticeInfoDTO creteApprenticeInfo(ApprenticeInfoDTO apprenticeInfoDTO);
	public ApprenticeInfoDTO getApprenticeInfo(int id);
	public List<ApprenticeInfoDTO> getAllApprenticeInfoDTO();
	public ApprenticeInfoDTO updateApprenticeInfo(int id, ApprenticeInfoDTO apprenticeInfoDTO);
	public Boolean deleteApprenticeInfo(int id);
}
