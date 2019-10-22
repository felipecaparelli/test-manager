package org.caparelli.testmanager.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.caparelli.testmanager.enumeration.TestType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Biochemistry")
@DiscriminatorValue("BIOCHEMISTRY")
@Getter @Setter @AllArgsConstructor
public class BiochemistryTest extends Test {
	
	private Integer completeBloodCount;
	
	public BiochemistryTest() {
		super.setType(TestType.BIOCHEMISTRY);
	}

}
