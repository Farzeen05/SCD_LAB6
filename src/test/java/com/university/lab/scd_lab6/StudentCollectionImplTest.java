package com.university.lab.scd_lab6;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentCollectionImplTest {
    private StudentCollection collection;

    @Before
    public void setUp() {
        collection = new StudentCollectionImpl();
    }

    @Test
    public void testAddAndFindStudent() {
        assertTrue(collection.isEmpty());
        assertEquals(0, collection.getSize());

        Student s1 = new Student(1, "Ali", 3.5);
        collection.addStudent(s1);

        assertEquals(1, collection.getSize());
        assertFalse(collection.isEmpty());

        Student found = collection.findStudent(1);
        assertNotNull(found);
        assertEquals("Ali", found.getName());
    }

    @Test
    public void testRemoveStudent() {
        Student s1 = new Student(1, "Ali", 3.5);
        collection.addStudent(s1);

        boolean removed = collection.removeStudent(1);
        assertTrue(removed);
        assertEquals(0, collection.getSize());
        assertTrue(collection.isEmpty());
        assertNull(collection.findStudent(1));
    }
}