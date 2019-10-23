package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Microbiology")
@DiscriminatorValue("MICROBIOLOGY")
@Getter @Setter @AllArgsConstructor
public class MicrobiologyTest extends Test {
	
	private String microbialGerms;
	
	public MicrobiologyTest() {
		super.setType(TestType.MICROBIOLOGY);
	}

}
