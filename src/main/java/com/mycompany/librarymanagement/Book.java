package com.mycompany.librarymanagement;

public class Book implements LibraryItem {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean available;

    public Book(String isbn, String title, String author, String genre, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.available = true; 
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    
    public boolean isAvailable() { return available; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setYear(int year) { this.year = year; }
    public void setAvailable(boolean available) { this.available = available; }

    
    public String getDetails() {
        String status = available ? "Available" : "Borrowed";
        return "[Book] \"" + title + "\" by " + author + " (" + year + ") | " + genre + " | " + status;
    }
}
