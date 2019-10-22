package org.caparelli.testmanager.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.caparelli.testmanager.enumeration.TestType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFactoryTest {

	@DisplayName("Test validate Test Type name")
	@Test
	void testGetTestTypeName() {
		TestType testType = TestType.BIOCHEMISTRY;
		assertEquals(TestType.BIOCHEMISTRY.name(), 
				TestFactory.getTest(testType).getType().name(),
				"TestType name should be equals to " + testType.name());
		
		testType = TestType.HEMATOLOGY;
		assertEquals(TestType.HEMATOLOGY.name(), 
				TestFactory.getTest(testType).getType().name(),
				"TestType name should be equals to " + testType.name());
		
		testType = TestType.MICROBIOLOGY;
		assertEquals(TestType.MICROBIOLOGY.name(), 
				TestFactory.getTest(testType).getType().name(),
				"TestType name should be equals to " + testType.name());
	}

	@DisplayName("Test validate Test Type class")
	@Test
	void testGetTestTypeClass() {
		TestType testType = TestType.BIOCHEMISTRY;
		assertEquals(TestType.BIOCHEMISTRY.getClazz(), 
				TestFactory.getTest(testType).getType().getClazz(),
				"TestType class should be equals to " + testType.getClazz().getName());
		
		testType = TestType.HEMATOLOGY;
		assertEquals(TestType.HEMATOLOGY.getClazz(), 
				TestFactory.getTest(testType).getType().getClazz(),
				"TestType class should be equals to " + testType.getClazz().getName());
		
		testType = TestType.MICROBIOLOGY;
		assertEquals(TestType.MICROBIOLOGY.getClazz(), 
				TestFactory.getTest(testType).getType().getClazz(),
				"TestType class should be equals to " + testType.getClazz().getName());
		
		
	}

}
