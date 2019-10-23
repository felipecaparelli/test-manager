package org.caparelli.testmanager.service;

import org.caparelli.testmanager.model.Clinician;
import org.caparelli.testmanager.model.Patient;
import org.caparelli.testmanager.repository.ClinicianRepository;
import org.caparelli.testmanager.repository.OrderRepository;
import org.caparelli.testmanager.repository.PatientRepository;
import org.caparelli.testmanager.request.Order;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    private ClinicianRepository clinicianRepository;

    private PatientRepository patientRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository repository, ClinicianRepository clinicianRepository, PatientRepository patientRepository) {
        this.repository = repository;
        this.clinicianRepository = clinicianRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public org.caparelli.testmanager.model.Order create(Order orderRequest) {

        org.caparelli.testmanager.model.Order entity = new org.caparelli.testmanager.model.Order();
        BeanUtils.copyProperties(orderRequest, entity);

        Clinician clinician = clinicianRepository.getOne(orderRequest.getOrderedBy().getClinicianId());
        entity.setOrderedBy(clinician);

        Patient patient = patientRepository.getOne(orderRequest.getPatient().getPatientId());
        entity.setPatient(patient);

        return repository.save(entity);
    }
}
