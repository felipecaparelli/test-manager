package org.caparelli.testmanager.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tb_orders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ord_id")
    private Long orderId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ordered_by", nullable = false)
    private Clinician orderedBy;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "order")
    private Set<Test> tests;
}
