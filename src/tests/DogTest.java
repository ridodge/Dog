package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Dog;

public class DogTest {
	private Dog stella = new Dog("Stella", 2, "Beagle");
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testNameNotNull() {
		assertNotNull(stella.getName());
	}
	

}
