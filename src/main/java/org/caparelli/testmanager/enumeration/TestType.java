package org.caparelli.testmanager.enumeration;

import org.caparelli.testmanager.model.BiochemistryTest;
import org.caparelli.testmanager.model.HematologyTest;
import org.caparelli.testmanager.model.MicrobiologyTest;
import org.caparelli.testmanager.model.Test;

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
