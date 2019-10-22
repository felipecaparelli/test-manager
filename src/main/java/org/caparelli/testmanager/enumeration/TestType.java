package org.caparelli.testmanager.enumeration;

import org.caparelli.testmanager.model.*;

public enum TestType {

	BIOCHEMISTRY(BiochemistryTest.class), 
	MICROBIOLOGY(MicrobiologyTest.class), 
	HEMATOLOGY(HematologyTest.class);

	private Class<? extends Test> clazz;

	TestType(Class<? extends Test> clazz) {
		this.clazz = clazz;
	}

	public Class<? extends Test> getClazz() {
		return this.clazz;
	}

}
