package GET2018.PF.PFAssignment3.Marksheet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarksheetTest {

	Marksheet marksheet;

	@Before
	public void init() {
		marksheet = new Marksheet(5, new double[] { 23.45, 70, 97.55, 34.67, 66.08 });
	}

	@Test
	public void testAverageOfGrades() {
		assertEquals(58.35, marksheet.averageOfGrades(), 0);
	}

	@Test
	public void testMaximumGrade() {
		assertEquals(97.55, marksheet.maximumGrade(), 0);
	}

	@Test
	public void testMinimumGrade() {
		assertEquals(23.45, marksheet.minimumGrade(), 0);
	}

	@Test
	public void testPercentOfPassedStudents() {
		assertEquals(60.0, marksheet.percentOfPassedStudents(), 0);
	}

}
