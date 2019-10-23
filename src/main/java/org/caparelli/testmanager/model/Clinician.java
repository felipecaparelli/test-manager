package org.caparelli.testmanager.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_clinicians")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Clinician {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "cli_id")
    private Long clinicianId;

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
