package com.aprentiship_cell.service.impl;

import com.aprentiship_cell.dto.GeneralInstructionDTO;
import com.aprentiship_cell.entity.GeneralInstruction;
import com.aprentiship_cell.repository.GeneralInstructionRepository;
import com.aprentiship_cell.service.GeneralInstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneralInstructionServiceImpl implements GeneralInstructionService {

    @Autowired
    private GeneralInstructionRepository generalInstructionRepository;

    @Override
    public GeneralInstructionDTO creteGeneralInstructionDTO(GeneralInstructionDTO generalInstructionDTO) {
        GeneralInstruction generalInstruction = dtoToEntity(generalInstructionDTO);
        generalInstruction = generalInstructionRepository.save(generalInstruction);
        return entityToDto(generalInstruction);
    }

    @Override
    public GeneralInstructionDTO getGeneralInstructionDTO(int id) {
        return generalInstructionRepository.findById(id)
                .map(this::entityToDto)
                .orElse(null);
    }

    @Override
    public List<GeneralInstructionDTO> getAllGeneralInstructionDTO() {
        List<GeneralInstruction> instructions = generalInstructionRepository.findAll();
        return instructions.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public GeneralInstructionDTO updateGeneralInstructionDTO(int id, GeneralInstructionDTO generalInstructionDTO) {
        return generalInstructionRepository.findById(id).map(generalInstruction -> {

            generalInstruction.setGenIstrId(generalInstructionDTO.getGenIstrId());
            generalInstruction.setGenIstrName(generalInstructionDTO.getGenIstrName());
            generalInstruction.setIsActive(generalInstructionDTO.getIsActive());

            GeneralInstruction updatedInstruction = generalInstructionRepository.save(generalInstruction);

            return entityToDto(updatedInstruction);
        }).orElse(null);
    }

    @Override
    public Boolean deleteGeneralInstructionDTO(int id) {
        if (generalInstructionRepository.existsById(id)) {
            generalInstructionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private GeneralInstruction dtoToEntity(GeneralInstructionDTO generalInstructionDTO) {
        GeneralInstruction generalInstruction = new GeneralInstruction();

        generalInstruction.setGenIstrId(generalInstructionDTO.getGenIstrId());
        generalInstruction.setGenIstrName(generalInstructionDTO.getGenIstrName());
        generalInstruction.setIsActive(generalInstructionDTO.getIsActive());

        return generalInstruction;
    }

    private GeneralInstructionDTO entityToDto(GeneralInstruction generalInstruction) {
        GeneralInstructionDTO generalInstructionDTO = new GeneralInstructionDTO();

        generalInstructionDTO.setGenIstrId(generalInstruction.getGenIstrId());
        generalInstructionDTO.setGenIstrName(generalInstruction.getGenIstrName());
        generalInstructionDTO.setIsActive(generalInstruction.getIsActive());

        return generalInstructionDTO;
    }
}

