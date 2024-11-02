package com.aprentiship_cell.controller;

import com.aprentiship_cell.dto.GeneralInstructionDTO;
import com.aprentiship_cell.service.GeneralInstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/general-instructions")
public class GeneralInstructionController {

    @Autowired
    private GeneralInstructionService generalInstructionService;

    //http://localhost:8080/general-instructions/addGenInstruction
    @PostMapping("/addGenInstruction")
    public ResponseEntity<GeneralInstructionDTO> createGeneralInstruction(@RequestBody GeneralInstructionDTO generalInstructionDTO) {
        GeneralInstructionDTO createdInstruction = generalInstructionService.creteGeneralInstructionDTO(generalInstructionDTO);
        return new ResponseEntity<>(createdInstruction, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralInstructionDTO> getGeneralInstructionById(@PathVariable int id) {
        GeneralInstructionDTO generalInstructionDTO = generalInstructionService.getGeneralInstructionDTO(id);
        return generalInstructionDTO != null ?
                ResponseEntity.ok(generalInstructionDTO) :
                ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<GeneralInstructionDTO>> getAllGeneralInstructions() {
        List<GeneralInstructionDTO> instructions = generalInstructionService.getAllGeneralInstructionDTO();
        return ResponseEntity.ok(instructions);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneralInstructionDTO> updateGeneralInstruction(
            @PathVariable int id, @RequestBody GeneralInstructionDTO generalInstructionDTO) {
        GeneralInstructionDTO updatedInstruction = generalInstructionService.updateGeneralInstructionDTO(id, generalInstructionDTO);
        return updatedInstruction != null ?
                ResponseEntity.ok(updatedInstruction) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGeneralInstruction(@PathVariable int id) {
        Boolean isDeleted = generalInstructionService.deleteGeneralInstructionDTO(id);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
