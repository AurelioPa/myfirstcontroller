package it.ntt.myfirstcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.myfirstcontroller.repository.BookRepository;

@Controller
public class BookContoller {

    BookRepository bookRepository;

    public BookContoller(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute( "books" ,bookRepository.findAll());        
        return "books";
    }
    
}
