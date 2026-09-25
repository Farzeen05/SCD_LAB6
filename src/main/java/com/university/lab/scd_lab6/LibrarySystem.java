package com.university.lab.scd_lab6;

public interface LibrarySystem {
    void addBook(Book book);
    boolean removeBook(int bookId);
    Book searchBook(int bookId);
    boolean issueBook(int bookId);
    boolean returnBook(int bookId);
}