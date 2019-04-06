package HW10.Bookz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class BookRepository implements Repository<Book>{

    Map<String,Book> books = new HashMap<>();
    String number;

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(String id) {
        for (Iterator<Map.Entry<String,Book>> del=books.entrySet().iterator(); del.hasNext();){
            Map.Entry<String,Book> entry = del.next();
            if (entry.getValue().getId().equals(id)) {
                return entry.getValue();
            }
        } return null;
    }

    @Override
    public void save(Book item) {
        books.put(number,item);
    }

    @Override
    public void delete(String id) {
        for (Iterator<Map.Entry<String,Book>> del=books.entrySet().iterator(); del.hasNext();){
            Map.Entry<String,Book> entry = del.next();
            if (entry.getValue().getId().equals(id)) {
                del.remove();
            }
        }
    }

    public void printToConsole() {
        System.out.println(books);
    }

    public static void main(String[] args) {
       BookRepository bookRepository = new BookRepository();
       bookRepository.number = "10";
       Book item = new Book("1","Onegins","Pushkin",256);
       bookRepository.save(item);
       bookRepository.number = "20";
       Book item1 = new Book("2","Voina i mir","Tolstoj",321);
       bookRepository.save(item1);
       bookRepository.number = "30";
       Book item2 = new Book("3","Gore ot uma","Griboedov",121);
       bookRepository.save(item2);
       bookRepository.printToConsole();
       bookRepository.delete("2");
       bookRepository.printToConsole();
       System.out.println(bookRepository.findById("1"));





    }

}
