package GET2018.DSA.DSSession2.NestedListJSON;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class performs different test on ListOfIntegers class
 * 
 * @author Mohit Sharma
 *
 */
public class NestedListTest {

	ListOfIntegers integersList;

	@Rule
	public ExpectedException ex = ExpectedException.none();

	@Before
	public void init() throws ParseException, IOException {
		integersList = new ListOfIntegers();
		integersList.addList("Integers1.JSON");
	}

	@Test
	public void addListTest() throws ParseException, IOException {
		// Add List using File Integers2.JSON
		integersList.addList("Integers2.JSON");
	}

	@Test
	public void addAllIntegersTest() {
		// Add all integers in Nested List
		assertEquals(192, integersList.addAllIntegers());
	}

	@Test
	public void largestIntegerTest() {
		// Largest Integer in NestedList
		assertEquals(70, integersList.largestInteger());
	}

	@Test
	public void searchElementTest() {
		// Search 22 in Nested List
		assertTrue(integersList.searchList(22));
	}

	@Test
	public void addListWithNull() throws ParseException, IOException {
		// Add Null in List
		ex.expect(NullPointerException.class);
		ex.expectMessage("FileName Can't be Empty");
		integersList.addList(null);
	}

	@Test
	public void addListFileNotFound() throws ParseException, IOException {
		// Add a file which not exist
		ex.expect(FileNotFoundException.class);
		ex.expectMessage("File not Found in addList");
		integersList.addList("AddInteger.json");
	}
}
