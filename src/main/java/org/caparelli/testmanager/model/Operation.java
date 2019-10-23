package org.caparelli.testmanager.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_operations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Operation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "opr_id")
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;
}
