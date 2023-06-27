package com.dal.patienttreatment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dal.patienttreatment.entity.DiseaseEntity;
import com.dal.patienttreatment.entity.DrugEntity;
import com.dal.patienttreatment.entity.Login;
import com.dal.patienttreatment.entity.PatientEntity;
import com.dal.patienttreatment.entity.TreatmentDiseaseEntity;
import com.dal.patienttreatment.entity.TreatmentDrugEntity;
import com.dal.patienttreatment.entity.TreatmentEntity;
import com.dal.patienttreatment.repository.DiseaseRepo;
import com.dal.patienttreatment.repository.DrugRepo;
import com.dal.patienttreatment.repository.LoginRepo;
import com.dal.patienttreatment.repository.PatientRepo;
import com.dal.patienttreatment.repository.TreatmentDiseaseRepo;
import com.dal.patienttreatment.repository.TreatmentDrugRepo;
import com.dal.patienttreatment.repository.TreatmentRepo;

@Service
public class patienttreatmentServiceImpl implements patienttreatmentService {

	@Autowired
	PatientRepo patientrepo;
	@Autowired
	TreatmentRepo treatmentRepo;
	@Autowired
	DrugRepo drugRepo;
	@Autowired
	DiseaseRepo diseaseRepo;
	@Autowired
	TreatmentDrugRepo treatmentdrugRepo;
	@Autowired
	TreatmentDiseaseRepo treatmentdiseaserepo;
	@Autowired
	LoginRepo loginrepo;

	// --PatientEntity--
	@Override
	public PatientEntity patientregister(@RequestBody PatientEntity patiententity) {
		return patientrepo.save(patiententity);
	}

	@Override
	public List<PatientEntity> Patientlist() {
		return (List<PatientEntity>) patientrepo.findAll();
	}

	@Override
	public Optional<PatientEntity> patientGetById(Long patientId) {
		return patientrepo.findById(patientId);
	}

	@Override
	public void deleteById(Long patientId) {
		patientrepo.deleteById(patientId);
	}

	@Override

	public PatientEntity updatePatient(PatientEntity patiententity) {
		PatientEntity existingpatient = patientrepo.findById(patiententity.getPatientId()).get();
		existingpatient.setPatientName(patiententity.getPatientName());
		existingpatient.setPatientGender(patiententity.getPatientGender());
		existingpatient.setPatientAge(patiententity.getPatientAge());
		existingpatient.setPatientBloodGroup(patiententity.getPatientBloodGroup());
		return patientrepo.save(existingpatient);

	}

	// --TreatmentEntity--
	@Override
	public TreatmentEntity saveTreatment(TreatmentEntity treatmententity) {
		PatientEntity patiententity = treatmententity.getPatiententity();
		treatmententity.setPatiententity(patiententity);
		return treatmentRepo.save(treatmententity);
	}

	@Override
	public List<TreatmentEntity> Treatmentlist() {
		return (List<TreatmentEntity>) treatmentRepo.findAll();
	}

	// --DrugEntity--
	@Override
	public DrugEntity addDrug(DrugEntity DrugEntity) {
		return drugRepo.save(DrugEntity);
	}

	@Override
	public List<DrugEntity> Druglist() {
		return (List<DrugEntity>) drugRepo.findAll();
	}

	// --DiseaseEntity--
	@Override
	public DiseaseEntity addDisease(DiseaseEntity diseaseentity) {
		return diseaseRepo.save(diseaseentity);
	}

	@Override
	public List<DiseaseEntity> Diseaselist() {
		return (List<DiseaseEntity>) diseaseRepo.findAll();
	}

	// --TreatmentDrug--
	@Override
	public TreatmentDrugEntity addTreatmentDrug(TreatmentDrugEntity treatmentdrug) {
		TreatmentEntity treatmententity = treatmentdrug.getTreatmententity();
		treatmentdrug.setTreatmententity(treatmententity);
		DrugEntity drugentity = treatmentdrug.getDrugEntity();
		treatmentdrug.setDrugEntity(drugentity);
		return treatmentdrugRepo.save(treatmentdrug);
	}

	@Override
	public List<TreatmentDrugEntity> TreatmentDruglist() {
		return (List<TreatmentDrugEntity>) treatmentdrugRepo.findAll();
	}

	// --TreatmentDiseaseEntity--
	@Override
	public TreatmentDiseaseEntity addTreatmentDisease(TreatmentDiseaseEntity treatmentdisease) {
		TreatmentEntity treatmententity = treatmentdisease.getTreatmententity();
		treatmentdisease.setTreatmententity(treatmententity);
		DiseaseEntity diseaseentity = treatmentdisease.getDiseaseentity();
		treatmentdisease.setDiseaseentity(diseaseentity);
		return treatmentdiseaserepo.save(treatmentdisease);
	}

	@Override
	public List<TreatmentDiseaseEntity> TreatmentDiseaselist() {
		return (List<TreatmentDiseaseEntity>) treatmentdiseaserepo.findAll();
	}

	// --Login--
	@Override
	public Login loginentry(Login login) {
		return loginrepo.save(login);
	}

	@Override
	public List<Login> login() {
		return (List<Login>) loginrepo.findAll();
	}
	

}
