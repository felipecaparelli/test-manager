package org.caparelli.testmanager.configuration;

import org.caparelli.testmanager.model.Clinician;
import org.caparelli.testmanager.model.Patient;
import org.caparelli.testmanager.repository.ClinicianRepository;
import org.caparelli.testmanager.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private ClinicianRepository clinicianRepository;

    private PatientRepository patientRepository;

    @Autowired
    public DataLoader(ClinicianRepository clinicianRepository, PatientRepository patientRepository) {
        this.clinicianRepository = clinicianRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        clinicianRepository.save(new Clinician().builder().documentNumber("123456").email("doctorray@medical.com").firstName("Ray").lastName("Johnson").build());
        patientRepository.save(new Patient().builder().documentNumber("6543234").email("mine@gmail.com").firstName("Felipe").lastName("Caparelli").build());
    }
}
