package com.aprentiship_cell.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ApprenticeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aprId;
	private String aprName;
	private int aprPNo;
	private int aprStuId;
	private String aprAdhaNum;
	private String aprCateg;
	private String aprTrade;
	private String aprDoj;
	private String aprContact;
	private String aprAcNo1;
	private String aprBank1;
	private String aprBranch1;
	private String aprAcNo2;
	private String aprBank2;
	private String aprBranch2;
	
	@ManyToOne
	private Division aprDirAttach;
	@ManyToOne
	private Employee aprControlOfc;
	@ManyToOne
	private Designation aprControlOfcDesig;
	
	private int aprIntTel;
	private String aprLocAdd;
	private String aprPerAdd;
	private String aprMob;
	private String aprEmail;
	private String aprBloodGrp;
	private String aprAnyMedCond;
	private String aprContPer;
	private String aprRelOfContPer;
	private String aprAddOfContPer;
	private String aprMobOfContPer;
	private int isActive;
}
