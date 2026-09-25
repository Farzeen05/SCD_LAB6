package com.university.lab.scd_lab6;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudentEncapsulationGetters() {
        // Create student instance
        Student student = new Student(101, "Ali", 3.8);

        // Verify data access via public getters
        assertEquals(101, student.getId());
        assertEquals("Ali", student.getName());
        assertEquals(3.8, student.getCgpa(), 0.001);
    }
}