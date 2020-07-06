import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
	Cohort cohort;
	Student student1;
	Student student2;
	Student student3;
	
	@Before
	public void setUp() {
		cohort = new Cohort();
		student1 = new Student("jim", 7);
		student2 = new Student("john", 8);
		student3 = new Student("jack", 9);
		student1.addGrade(100);
		student1.addGrade(80);
		student2.addGrade(75);
		student2.addGrade(68);
		student3.addGrade(75);
		student3.addGrade(100);
	}
	
	@Test
	public void testMethods() {
		cohort.addStudent(student1);
		cohort.addStudent(student2);
		cohort.addStudent(student3);
		assertEquals(3, cohort.getStudents().size());
		assertEquals(83, cohort.getCohortAverage(), 0);
	}
}
