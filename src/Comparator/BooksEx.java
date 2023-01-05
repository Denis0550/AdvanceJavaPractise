package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BooksEx {

    public static void printBookList(List<Book> templist) {
        for(Book b: templist) {
            System.out.println(b.name + " | " + b.author + " | " +b.publishYear);
        }
    }
    public static void main(String[] args) {


    Book book1 = new Book("Leviathan Falls", "James S.A. Corey", 2021,4.59);
    Book book2 = new Book("Sea of Tranquility", "Emily St. John Mandel", 2022,4.16);
    Book book3 = new Book("Nona the Ninth", "Tamsyn Muir", 2022,4.45);
    Book book4 = new Book("Neuromancer", "William Gibson", 2021,3.90);
    Book book5 = new Book("Project Hail Mary", "Andy Weir", 2021,4.52);
    Book book6 = new Book("Dune", "Frank Herbert", 1965,4.25);

    List<Book> bookList = new ArrayList<>();
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    bookList.add(book4);
    bookList.add(book5);
    bookList.add(book6);

    printBookList(bookList);
        System.out.println("####################################################");

    BookComparatorYear compareOnYear = new BookComparatorYear();
        Collections.sort(bookList, compareOnYear);
        printBookList(bookList);
    }
}
