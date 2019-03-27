package HW9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library{

   private List<Book> books = new ArrayList<>();

   public void createBook (String author, String title) {
     books.add(1,"aaa");
   }
   public void removeBookFFromLibrary() {}
   public void findBookInLibraryByTitle() {}
   public void findBookInLibraryByAuthor () {}


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
