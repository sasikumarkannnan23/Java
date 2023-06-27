package com.dal.patienttreatment.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class TreatmentDrugEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long treatmentdrugId;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "treatmentId", referencedColumnName = "treatmentId")
	private TreatmentEntity treatmententity;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "drugId", referencedColumnName = "drugId")
	private DrugEntity drugEntity;

}
