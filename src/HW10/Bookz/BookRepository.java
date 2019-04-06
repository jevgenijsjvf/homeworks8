package HW10.Bookz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookRepository implements Repository<Book> {

    Map<String, Book> books = new HashMap<>();

    @Override
    public List<Book> findAll() {
        List<Book> printAll = new ArrayList<>();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            printAll.add(entry.getValue());
        }
        return printAll;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (books.containsKey(id)) {
            return books.get(id);
        } else {
           throw new ItemNotFoundException(id);
        }
    }

    @Override
    public void save(Book item) {
        String id = item.getId();
        books.put(id, item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {

        if (books.containsKey(id)) {
            books.remove(id);
        } else {
            throw new ItemNotFoundException(id);
        }
    }

    public void printToConsole() {
        System.out.println("Items on map: " + books);
    }

}
