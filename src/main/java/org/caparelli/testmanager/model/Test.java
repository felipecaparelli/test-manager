package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tb_tests")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Test {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "tst_id")
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
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
