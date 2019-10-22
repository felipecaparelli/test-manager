package org.caparelli.testmanager.factory;

import org.caparelli.testmanager.enumeration.TestType;
import org.caparelli.testmanager.model.Test;
import org.springframework.stereotype.Component;

@Component
public class TestFactory {
	
	public static Test getTest(TestType testType) {
		try {
			return testType.getClazz().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new IllegalArgumentException("Invalid Test Type");
		}
	}

}
