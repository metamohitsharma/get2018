package GET2018.PF.PFAssignment3.StringOperations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringOperationsTest {
	StringOperations operations;

	@Before
	public void init() {
		operations = new StringOperations("Graduate Engineer Trainee");
	}

	@Test
	public void testEquals() {
		assertEquals(0, operations.isEquals("Graduate Engineering"));
	}

	@Test
	public void testReverseString() {
		assertEquals("eeniarT reenignE etaudarG", operations.reverseString());
	}

	@Test
	public void testViceVersa() {
		assertEquals("gRADUATE eNGINEER tRAINEE", operations.viceVersa());
	}

	@Test
	public void testLongestWord() {
		assertEquals("Engineer", operations.longestWord());
	}
}
