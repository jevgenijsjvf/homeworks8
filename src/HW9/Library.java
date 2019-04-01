package HW9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book> books = new ArrayList<>();


    public void createBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).getTitle();
            if (books.get(i).getTitle().equals(title)) {
                return books.get(i);
            }
        }
        return null;
    }


    public Book findByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).getAuthor();
            if (books.get(i).getAuthor().equals(author)) {
                System.out.println("Book which you are search: " + books.get(i));
                return books.get(i);
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }


}
