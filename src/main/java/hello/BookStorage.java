package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookStorage {
    List<Book> books = new ArrayList<Book>();


    void add(Book book) {
        books.add(book);
    }

    void remove(int id) {
        books.remove(id);
    }

    public List<Book> getAll() {
        return books;
    }

    public Integer size() {
        return books.size();
    }
}

