package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = bookList();

        WelcomeUser welcomeUser = new WelcomeUser(System.out);
        Library library = new Library(books);
        Librarian librarian = new Librarian(library, welcomeUser);

        librarian.openLibrary();
    }

    private static List<Book> bookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Dracula", "Bram Stoker", "1875", System.out));
        books.add(new Book("Moby Dick", "Sherman Melville", "1890", System.out));
        return books;
    }
}