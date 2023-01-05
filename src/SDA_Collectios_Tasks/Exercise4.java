package SDA_Collectios_Tasks;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');

        Book book1 = new Book("Book 1", 34, 2000,
                Arrays.asList(author1), Genre.FANTASY);
        Book book2 = new Book("Book 1", 56, 1999,
                Arrays.asList(author2, author3, author4), Genre.ACTION);

        BookServiceEx bookServiceEx = new BookServiceEx();
        bookServiceEx.add(book1);
        bookServiceEx.add(book2);
        System.out.println(bookServiceEx.mapBooks());


    }
}

class BookServiceEx {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }
    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAll() {
        return books;
    }

    public Map<Genre, String> mapBooks() {
        Map<Genre, String> booksMap = new HashMap<>();
        for (Book book: books) {
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }

}
