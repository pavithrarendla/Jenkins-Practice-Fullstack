package com.klef.dev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {
    @Id
    @Column(name = "book_id")
    private int id;

    @Column(name = "book_title", nullable = false, length = 100)
    private String title;

    @Column(name = "book_author", nullable = false, length = 50)
    private String author;

    @Column(name = "book_category", nullable = false, length = 50)
    private String category;

    @Column(name = "book_publisher", nullable = false, length = 50)
    private String publisher;

    @Column(name = "book_year", nullable = false)
    private int year;

    @Column(name = "book_isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "book_copies", nullable = false)
    private int copies;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getCopies() { return copies; }
    public void setCopies(int copies) { this.copies = copies; }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category
                + ", publisher=" + publisher + ", year=" + year + ", isbn=" + isbn + ", copies=" + copies + "]";
    }
}
