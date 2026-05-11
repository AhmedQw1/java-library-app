package com.mycompany.librarymanagement;

public class EBook extends Book {
    
    private String fileFormat;
    private double fileSizeMB;

    public EBook(String isbn, String title, String author, String genre, int year, String fileFormat, double fileSizeMB) {
        super(isbn, title, author, genre, year); 
        this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;
    }

    public String getFileFormat() { 
        return fileFormat; 
    }
    
    public double getFileSizeMB() { 
        return fileSizeMB; 
    }

    public String getDetails() {
        String status = isAvailable() ? "Available" : "Borrowed";
        return "[EBook] \"" + getTitle() + "\" by " + getAuthor() + " (" + getYear() + ") | " 
               + fileFormat + " | " + fileSizeMB + " MB | " + status;
    }
}