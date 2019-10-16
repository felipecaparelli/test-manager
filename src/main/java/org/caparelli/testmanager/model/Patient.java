package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {
    private Integer id;
    private String name;
    private Collection<Order> orders;
}
