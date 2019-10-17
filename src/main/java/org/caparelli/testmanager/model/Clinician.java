package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_clinicians")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Clinician {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "cli_id")
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

}
