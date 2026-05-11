package com.mycompany.librarymanagement;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public Book findByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public ArrayList<Book> search(String query) {
        ArrayList<Book> searchResults = new ArrayList<>();
        String lowerQuery = query.toLowerCase();

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(lowerQuery)
                    || b.getAuthor().toLowerCase().contains(lowerQuery)
                    || b.getGenre().toLowerCase().contains(lowerQuery)) {

                searchResults.add(b);
            }
        }
        return searchResults;
    }

    public int totalBooks() {
        return books.size();
    }

    public long availableCount() {
        long count = 0;
        for (Book b : books) {
            if (b.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public long borrowedCount() {
        long count = 0;
        for (Book b : books) {
            if (!b.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
