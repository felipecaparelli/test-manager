package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tb_orders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ord_id")
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "order")
    private Set<Test> tests;
}
