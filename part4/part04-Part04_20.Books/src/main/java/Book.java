/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
public class Book {
    private String bookTitle;
    private int totalPages;
    private int releaseYear;
    
    public Book(String bookTitle, int totalPages, int releaseYear){
        this.bookTitle = bookTitle;
        this.totalPages = totalPages;
        this.releaseYear = releaseYear;
    }
    
    public String getDetails() {
        return this.bookTitle + ", " + this.totalPages + " pages, " + this.releaseYear;
    }
    
    public String getTitle() {
        return this.bookTitle;
    }
    
}
