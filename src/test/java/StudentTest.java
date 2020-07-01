import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
	
	Student student;
	
	@Before
	public void setUp() {
		student = new Student("jim", 5);
	}
	
	@Test
	public void testGetId() {
		assertEquals(5, student.getId());
	}
	
	@Test
	public void testGetName() {
		assertEquals("jim", student.getName());
	}
	
	@Test
	public void testGradeMethods() {
		student.addGrade(75);
		student.addGrade(100);
		assertEquals(87.5, student.getGradeAverage(), 0);
	}
}
