package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pat_id")
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    private Collection<Order> orders;
}
