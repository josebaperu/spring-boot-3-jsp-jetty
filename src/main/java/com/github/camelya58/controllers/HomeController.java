package com.github.camelya58.controllers;


import com.github.camelya58.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    private ArrayList<Book> books = new ArrayList<>();

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }


}
