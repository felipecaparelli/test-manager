package org.caparelli.testmanager.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.caparelli.testmanager.enumeration.TestType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_tests")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public abstract class Test {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "tst_id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @Column(name = "type", insertable = false, updatable = false, nullable = false)
    @Enumerated(EnumType.STRING)
    private TestType type;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ordered_by", nullable = false)
    private Clinician orderedBy;

    @OneToMany(fetch=FetchType.LAZY)
    private Set<Operation> operations;
}
