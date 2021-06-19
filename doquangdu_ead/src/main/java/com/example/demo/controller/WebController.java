package com.example.demo.controller;
import com.example.demo.entity.BookEntity;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    BookService bookService;


    @GetMapping({"/list","/home"})
    public String pageableBook(Model model,  @RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size) {
        List<BookEntity> books = bookService.getAllBook(PageRequest.of(page, size));
        int totalPage  = bookService.getTotalPage(PageRequest.of(page, size));
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("size", size);
        model.addAttribute("page", page);
        model.addAttribute("books", books);
        return "listpro";
    }

    @GetMapping("/create")
    public String viewAddBook(Model model) {
        BookEntity bookEntity = new BookEntity();
        model.addAttribute("model", bookEntity);
        return "addpro";
    }

    @PostMapping("/create")
    public String addBook(@ModelAttribute BookEntity bookEntity, Model model) {
        bookService.createBook(bookEntity);
        return "redirect:/list";
    }
}
