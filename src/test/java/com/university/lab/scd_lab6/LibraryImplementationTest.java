package com.university.lab.scd_lab6;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryImplementationTest {

    @Test
    public void testLibraryOperations() {
        LibrarySystem library = new LibraryImplementation();
        Book book = new Book(101, "Clean Code", "Robert C. Martin");

        // Test addBook & searchBook
        library.addBook(book);
        assertNotNull(library.searchBook(101));
        assertEquals("Clean Code", library.searchBook(101).getTitle());

        // Test issueBook
        assertTrue(library.issueBook(101));
        assertTrue(library.searchBook(101).isIssued());

        // Test returnBook
        assertTrue(library.returnBook(101));
        assertFalse(library.searchBook(101).isIssued());

        // Test removeBook
        assertTrue(library.removeBook(101));
        assertNull(library.searchBook(101));
    }
}