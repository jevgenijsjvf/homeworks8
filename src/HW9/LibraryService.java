package HW9;

import com.sun.jmx.mbeanserver.Repository;

import java.util.ArrayList;
import java.util.List;

import HW9.Library;

public class LibraryService {
    public static void main(String[] args) {

        Library library = new Library();

      //  library.createBook("Autors","Day after tomorrow");

        System.out.println(library.getBooks());
    }
}
