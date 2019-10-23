package org.caparelli.testmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.caparelli.testmanager.enumeration.TestType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Hematology")
@DiscriminatorValue("HEMATOLOGY")
@Getter @Setter @AllArgsConstructor
public class HematologyTest extends Test {
	
	private Integer fullBloodCount;
	
	private String bloodFilm;
	
	public HematologyTest() {
		super.setType(TestType.HEMATOLOGY);
	}

}
