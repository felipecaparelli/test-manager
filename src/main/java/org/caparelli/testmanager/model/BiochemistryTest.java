package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Biochemistry")
@DiscriminatorValue("BIOCHEMISTRY")
@Getter @Setter @AllArgsConstructor
public class BiochemistryTest extends Test {
	
	private Integer completeBloodCount;
	
	public BiochemistryTest() {
		super.setType(TestType.BIOCHEMISTRY);
	}

}
