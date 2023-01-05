package SDA_Exceptions_Tasks;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("Harry Potter Part 1", "J.K. Rowling", "3323-434ds"));
        bookRepository.add(new Book("Harry Potter Part 2", "J.K. Rowling", "54dsd-dsds"));

        List<Book> book = bookRepository.findByName("??");
        Book book1 = bookRepository.findByIsbn("??");
        bookRepository.delete("43");

    }
}


class NoBookFoundException extends  Exception {
    public NoBookFoundException (String message) {
       super(message);
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        this.books.add(book);
    }

    public void delete(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Cant delete book with isbn: " + isbn);
    }

    public Book findByIsbn(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException("Cant find book with isbn: " + isbn);
    }

    public List<Book> findByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Cant find book with name: " + name);
        }
        return booksByName;
    }
}