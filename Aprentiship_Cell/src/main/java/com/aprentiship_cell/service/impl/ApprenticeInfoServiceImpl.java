package com.aprentiship_cell.service.impl;


import com.aprentiship_cell.dto.ApprenticeInfoDTO;
import com.aprentiship_cell.entity.ApprenticeInfo;
import com.aprentiship_cell.repository.ApprenticeInfoRepository;
import com.aprentiship_cell.service.ApprenticeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenticeInfoServiceImpl implements ApprenticeInfoService {

	@Autowired
	private ApprenticeInfoRepository apprenticeInfoRepository;

	@Override
	public ApprenticeInfoDTO creteApprenticeInfo(ApprenticeInfoDTO apprenticeInfoDTO) {
		ApprenticeInfo apprenticeInfo = apprenticeInfoDto_To_Entity(apprenticeInfoDTO);
		apprenticeInfo = apprenticeInfoRepository.save(apprenticeInfo);
		return apprenticeInfoEntity_To_Dto(apprenticeInfo);
	}

	@Override
	public ApprenticeInfoDTO getApprenticeInfo(int id) {
		return apprenticeInfoRepository.findById(id)
				.map(this::apprenticeInfoEntity_To_Dto)
				.orElse(null);
	}

	@Override
	public List<ApprenticeInfoDTO> getAllApprenticeInfoDTO() {
		List<ApprenticeInfo> listOfApprenticeInfo = apprenticeInfoRepository.findAll();
		return listOfApprenticeInfo.stream()
				.map(this::apprenticeInfoEntity_To_Dto)
				.toList();
	}

	@Override
	public ApprenticeInfoDTO updateApprenticeInfo(int id, ApprenticeInfoDTO apprenticeInfoDTO) {
		return apprenticeInfoRepository.findById(id).map(apprenticeInfo -> {
			// Update fields of the existing ApprenticeInfo entity from apprenticeInfoDTO
			apprenticeInfo.setAprId(apprenticeInfoDTO.getAprId());
			apprenticeInfo.setAprName(apprenticeInfoDTO.getAprName());
			apprenticeInfo.setAprPNo(apprenticeInfoDTO.getAprPNo());
			apprenticeInfo.setAprStuId(apprenticeInfoDTO.getAprStuId());
			apprenticeInfo.setAprAdhaNum(apprenticeInfoDTO.getAprAdhaNum());
			apprenticeInfo.setAprCateg(apprenticeInfoDTO.getAprCateg());
			apprenticeInfo.setAprTrade(apprenticeInfoDTO.getAprTrade());
			apprenticeInfo.setAprDoj(apprenticeInfoDTO.getAprDoj());
			apprenticeInfo.setAprContact(apprenticeInfoDTO.getAprContact());
			apprenticeInfo.setAprAcNo1(apprenticeInfoDTO.getAprAcNo1());
			apprenticeInfo.setAprBank1(apprenticeInfoDTO.getAprBank1());
			apprenticeInfo.setAprBranch1(apprenticeInfoDTO.getAprBranch1());
			apprenticeInfo.setAprAcNo2(apprenticeInfoDTO.getAprAcNo2());
			apprenticeInfo.setAprBank2(apprenticeInfoDTO.getAprBank2());
			apprenticeInfo.setAprBranch2(apprenticeInfoDTO.getAprBranch2());

			// Additional fields as necessary
			apprenticeInfo.setAprIntTel(apprenticeInfoDTO.getAprIntTel());
			apprenticeInfo.setAprLocAdd(apprenticeInfoDTO.getAprLocAdd());
			apprenticeInfo.setAprPerAdd(apprenticeInfoDTO.getAprPerAdd());
			apprenticeInfo.setAprMob(apprenticeInfoDTO.getAprMob());
			apprenticeInfo.setAprEmail(apprenticeInfoDTO.getAprEmail());
			apprenticeInfo.setAprBloodGrp(apprenticeInfoDTO.getAprBloodGrp());
			apprenticeInfo.setAprAnyMedCond(apprenticeInfoDTO.getAprAnyMedCond());
			apprenticeInfo.setAprContPer(apprenticeInfoDTO.getAprContPer());
			apprenticeInfo.setAprRelOfContPer(apprenticeInfoDTO.getAprRelOfContPer());
			apprenticeInfo.setAprAddOfContPer(apprenticeInfoDTO.getAprAddOfContPer());
			apprenticeInfo.setAprMobOfContPer(apprenticeInfoDTO.getAprMobOfContPer());
			apprenticeInfo.setIsActive(apprenticeInfoDTO.getIsActive());

			ApprenticeInfo updatedApprentice = apprenticeInfoRepository.save(apprenticeInfo);
			return apprenticeInfoEntity_To_Dto(updatedApprentice);
		}).orElse(null);
	}

	@Override
	public Boolean deleteApprenticeInfo(int id) {
		if (apprenticeInfoRepository.existsById(id)) {
			apprenticeInfoRepository.deleteById(id);
			return true;
		}
		return false;
	}


	// Helper method to convert DTO to Entity
	private ApprenticeInfo apprenticeInfoDto_To_Entity(ApprenticeInfoDTO apprenticeInfoDTO) {
		ApprenticeInfo apprenticeInfo = new ApprenticeInfo();
		apprenticeInfo.setAprId(apprenticeInfoDTO.getAprId());
		apprenticeInfo.setAprName(apprenticeInfoDTO.getAprName());
		apprenticeInfo.setAprPNo(apprenticeInfoDTO.getAprPNo());
		apprenticeInfo.setAprStuId(apprenticeInfoDTO.getAprStuId());
		apprenticeInfo.setAprAdhaNum(apprenticeInfoDTO.getAprAdhaNum());
		apprenticeInfo.setAprCateg(apprenticeInfoDTO.getAprCateg());
		apprenticeInfo.setAprTrade(apprenticeInfoDTO.getAprTrade());
		apprenticeInfo.setAprDoj(apprenticeInfoDTO.getAprDoj());
		apprenticeInfo.setAprContact(apprenticeInfoDTO.getAprContact());
		apprenticeInfo.setAprAcNo1(apprenticeInfoDTO.getAprAcNo1());
		apprenticeInfo.setAprBank1(apprenticeInfoDTO.getAprBank1());
		apprenticeInfo.setAprBranch1(apprenticeInfoDTO.getAprBranch1());
		apprenticeInfo.setAprAcNo2(apprenticeInfoDTO.getAprAcNo2());
		apprenticeInfo.setAprBank2(apprenticeInfoDTO.getAprBank2());
		apprenticeInfo.setAprBranch2(apprenticeInfoDTO.getAprBranch2());

		// Additional fields as necessary
		apprenticeInfo.setAprIntTel(apprenticeInfoDTO.getAprIntTel());
		apprenticeInfo.setAprLocAdd(apprenticeInfoDTO.getAprLocAdd());
		apprenticeInfo.setAprPerAdd(apprenticeInfoDTO.getAprPerAdd());
		apprenticeInfo.setAprMob(apprenticeInfoDTO.getAprMob());
		apprenticeInfo.setAprEmail(apprenticeInfoDTO.getAprEmail());
		apprenticeInfo.setAprBloodGrp(apprenticeInfoDTO.getAprBloodGrp());
		apprenticeInfo.setAprAnyMedCond(apprenticeInfoDTO.getAprAnyMedCond());
		apprenticeInfo.setAprContPer(apprenticeInfoDTO.getAprContPer());
		apprenticeInfo.setAprRelOfContPer(apprenticeInfoDTO.getAprRelOfContPer());
		apprenticeInfo.setAprAddOfContPer(apprenticeInfoDTO.getAprAddOfContPer());
		apprenticeInfo.setAprMobOfContPer(apprenticeInfoDTO.getAprMobOfContPer());
		apprenticeInfo.setIsActive(apprenticeInfoDTO.getIsActive());

		return apprenticeInfo;
	}

	// Helper method to convert Entity to DTO
	private ApprenticeInfoDTO apprenticeInfoEntity_To_Dto(ApprenticeInfo apprenticeInfo) {
		ApprenticeInfoDTO apprenticeInfoDTO = new ApprenticeInfoDTO();
		apprenticeInfoDTO.setAprId(apprenticeInfo.getAprId());
		apprenticeInfoDTO.setAprName(apprenticeInfo.getAprName());
		apprenticeInfoDTO.setAprPNo(apprenticeInfo.getAprPNo());
		apprenticeInfoDTO.setAprStuId(apprenticeInfo.getAprStuId());
		apprenticeInfoDTO.setAprAdhaNum(apprenticeInfo.getAprAdhaNum());
		apprenticeInfoDTO.setAprCateg(apprenticeInfo.getAprCateg());
		apprenticeInfoDTO.setAprTrade(apprenticeInfo.getAprTrade());
		apprenticeInfoDTO.setAprDoj(apprenticeInfo.getAprDoj());
		apprenticeInfoDTO.setAprContact(apprenticeInfo.getAprContact());
		apprenticeInfoDTO.setAprAcNo1(apprenticeInfo.getAprAcNo1());
		apprenticeInfoDTO.setAprBank1(apprenticeInfo.getAprBank1());
		apprenticeInfoDTO.setAprBranch1(apprenticeInfo.getAprBranch1());
		apprenticeInfoDTO.setAprAcNo2(apprenticeInfo.getAprAcNo2());
		apprenticeInfoDTO.setAprBank2(apprenticeInfo.getAprBank2());
		apprenticeInfoDTO.setAprBranch2(apprenticeInfo.getAprBranch2());

		// Additional fields as necessary
		apprenticeInfoDTO.setAprIntTel(apprenticeInfo.getAprIntTel());
		apprenticeInfoDTO.setAprLocAdd(apprenticeInfo.getAprLocAdd());
		apprenticeInfoDTO.setAprPerAdd(apprenticeInfo.getAprPerAdd());
		apprenticeInfoDTO.setAprMob(apprenticeInfo.getAprMob());
		apprenticeInfoDTO.setAprEmail(apprenticeInfo.getAprEmail());
		apprenticeInfoDTO.setAprBloodGrp(apprenticeInfo.getAprBloodGrp());
		apprenticeInfoDTO.setAprAnyMedCond(apprenticeInfo.getAprAnyMedCond());
		apprenticeInfoDTO.setAprContPer(apprenticeInfo.getAprContPer());
		apprenticeInfoDTO.setAprRelOfContPer(apprenticeInfo.getAprRelOfContPer());
		apprenticeInfoDTO.setAprAddOfContPer(apprenticeInfo.getAprAddOfContPer());
		apprenticeInfoDTO.setAprMobOfContPer(apprenticeInfo.getAprMobOfContPer());
		apprenticeInfoDTO.setIsActive(apprenticeInfo.getIsActive());

		return apprenticeInfoDTO;
	}
}
