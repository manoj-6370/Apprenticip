package com.aprentiship_cell.dto;

import lombok.Data;

@Data
public class ApprentishipMemberDTO {

	private int apprentishipMemberId;

	private PrimaryRoleDTO primaryRoleId;
	
	private int isActive;
}