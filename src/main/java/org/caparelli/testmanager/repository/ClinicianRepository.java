package org.caparelli.testmanager.repository;

import org.caparelli.testmanager.model.Clinician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicianRepository extends JpaRepository<Clinician, Long> {
}
