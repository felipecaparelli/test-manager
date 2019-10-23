package org.caparelli.testmanager.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_patients")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doc_number", length = 80, nullable = false)
    private String documentNumber = null;

    @Column(name = "first_name", length = 80, nullable = false)
    private String firstName = null;

    @Column(name = "last_name", length = 80, nullable = false)
    private String lastName = null;

    @Column(name = "email", length = 80, nullable = false)
    private String email = null;

    @Column(name = "phone", length = 80)
    private String phone = null;
}
