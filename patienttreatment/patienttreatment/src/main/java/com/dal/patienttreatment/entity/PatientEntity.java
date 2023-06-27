package com.dal.patienttreatment.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	private String patientName;
	private char patientGender;
	private int patientAge;
	private String patientBloodGroup;
	
}
