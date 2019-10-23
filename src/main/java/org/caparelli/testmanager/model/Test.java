package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import javax.persistence.*;
import java.util.Set;

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
