package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookController {


    @Autowired
    protected  BookStorage books;

    @GetMapping("/books")
    public String booksForm(Model model) {
        model.addAttribute("books", books.getAll());
        return "books";
    }

    @GetMapping("/books/new")
    public String booksNew(@ModelAttribute Book book, Model model) {
        model.addAttribute("book",  book);
        return "res";
    }

    @PostMapping("/books/new")
    public String booksSubmit(@ModelAttribute Book book, Model model) {
        books.add(book);
        return "redirect:/books";
    }


    @GetMapping("/books/remove")
    public String booksRem( Model model) {
        books.remove(books.size() - 1);
        return "redirect:/books";
    }
}

