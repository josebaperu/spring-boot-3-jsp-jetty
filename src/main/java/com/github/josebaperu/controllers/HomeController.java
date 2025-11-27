package com.github.josebaperu.controllers;


import com.github.josebaperu.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    private ArrayList<Book> books = new ArrayList<>();

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }


}
