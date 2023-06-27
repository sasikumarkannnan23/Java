package com.dal.patienttreatment.service;

import java.util.List;
import java.util.Optional;

import com.dal.patienttreatment.entity.DiseaseEntity;
import com.dal.patienttreatment.entity.DrugEntity;
import com.dal.patienttreatment.entity.Login;
import com.dal.patienttreatment.entity.PatientEntity;
import com.dal.patienttreatment.entity.TreatmentDiseaseEntity;
import com.dal.patienttreatment.entity.TreatmentDrugEntity;
import com.dal.patienttreatment.entity.TreatmentEntity;

public interface patienttreatmentService {
	//--PatientEntity--
	public PatientEntity patientregister(PatientEntity patiententity);
    public List<PatientEntity> Patientlist();
    public Optional <PatientEntity> patientGetById(Long patientId);
	public void deleteById(Long patientId);
	public PatientEntity updatePatient(PatientEntity patiententity);
    //--TreatmentEntity--
    public TreatmentEntity saveTreatment(TreatmentEntity treatmententity);
    public List<TreatmentEntity> Treatmentlist();
    //--DrugEntity--
    public DrugEntity addDrug(DrugEntity drugentity);
    public List<DrugEntity> Druglist();
    //--DiseaseEntity--
    public DiseaseEntity addDisease(DiseaseEntity diseaseentity);
    public List<DiseaseEntity> Diseaselist();
    //--TreatmentDrug--
    public TreatmentDrugEntity addTreatmentDrug(TreatmentDrugEntity treatmentdrug);
    public List<TreatmentDrugEntity> TreatmentDruglist();
    //--TreatmentDisease--
    public TreatmentDiseaseEntity addTreatmentDisease(TreatmentDiseaseEntity treatmentdisease);
    public List<TreatmentDiseaseEntity> TreatmentDiseaselist();
    //--Login--
    public Login loginentry(Login login);
    public List<Login> login();

    
    
}
