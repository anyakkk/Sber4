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

    @GetMapping("/books/remove/{id}")
    String booksRem(@PathVariable Long id, Model model) {
        if  (id != null)
            books.remove((int)(long)id);
        return "redirect:/books";
    }
}

