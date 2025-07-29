package miniProject.com.mile1.test;

import miniProject.com.mile1.bean.Student;
import miniProject.com.mile1.service.*;
import miniProject.com.mile1.exception.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStudent {
	
	StudentReport sr = new StudentReport();
	StudentService ss = new StudentService();

	@Test
	public void testTC1() throws Exception {
		Student s = new Student("sekar", new int[] { 80, 80, 85 }, null);
		assertEquals("A", sr.findGrades(s));
	}

	@Test
	public void testTC2() throws Exception {
		Student s = new Student("sekar", new int[] { 50, 50, 45 }, null);
		assertEquals("C", sr.findGrades(s));
	}

	@Test
	public void testTC3() throws Exception {
		Student s = new Student("sekar", new int[] { 80, 25, 40 }, null);
		assertEquals("F", sr.findGrades(s));
	}

	@Test
	public void testTC4() throws Exception {
		Student s = null;
		assertThrows(NullStudentObjectException.class, () -> sr.validate(s));
	}

	@Test
	public void testTC5() throws Exception {
		Student s = new Student(null, new int[] { 80, 25, 40 }, null);
		assertThrows(NullNameException.class, () -> sr.validate(s));
	}

	@Test
	public void testTC6() throws Exception {
		Student s = new Student("sekar", null, null);
		assertThrows(NullMarksArrayException.class, () -> sr.validate(s));
	}

	@Test
	public void testTC7() throws Exception {
		Student[] s = new Student[] { new Student("sekar", new int[] { 80, 80, 85 }, null),
				new Student(null, new int[] { 90, 90, 90 }, null) };
		assertEquals(1, ss.findNumberOfNullName(s));
	}

	@Test
	public void testTC8() throws Exception {
		Student[] s = new Student[] { new Student("sekar", new int[] { 80, 80, 85 }, null), null, null };

		assertEquals(2, ss.findNumberOfNullObjects(s));
	}

	@Test
	public void testTC9() throws Exception {
		Student[] s = new Student[] { new Student("sekar", new int[] { 80, 80, 85 }, null),
				new Student("Ramu", null, null) };

		assertEquals(1, ss.findNumberOfNullMarksArray(s));
	}

}
