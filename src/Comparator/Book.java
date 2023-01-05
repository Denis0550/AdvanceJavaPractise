package Comparator;

public class Book {
    String name;
    String author;
    int publishYear;
    double rating;

    public Book(String name, String author, int publishYear, double rating) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



}
