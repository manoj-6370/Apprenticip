package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ApprentishipMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int apprentishipMemberId;
	
	@OneToOne
	private PrimaryRole primaryRoleId;
	
	private int isActive;
}