package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import java.util.Set;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Test {
    private Integer id;
    private String name;
    private TestType type;
    private Clinician orderedBy;
    private Set<Operation> operations;
}
