package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Dog;

public class DogTest2 {
	private Dog dog = new Dog();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBark() {
		assertEquals("WOOF!", dog.bark());
	}
	@Test
	public void testNameNull() {
		assertNull(dog.getName());
	}

}
