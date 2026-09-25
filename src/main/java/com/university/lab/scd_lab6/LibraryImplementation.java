package com.university.lab.scd_lab6;

import java.util.HashMap;
import java.util.Map;

public class LibraryImplementation implements LibrarySystem {
    private Map<Integer, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public boolean removeBook(int bookId) {
        return books.remove(bookId) != null;
    }

    @Override
    public Book searchBook(int bookId) {
        return books.get(bookId);
    }

    @Override
    public boolean issueBook(int bookId) {
        Book book = books.get(bookId);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(int bookId) {
        Book book = books.get(bookId);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            return true;
        }
        return false;
    }
}