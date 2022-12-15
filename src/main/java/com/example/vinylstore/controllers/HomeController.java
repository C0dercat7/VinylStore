package com.example.vinylstore.controllers;

import com.example.vinylstore.repositories.ProductRepository;
import com.example.vinylstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth/login")
public class FrontController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }


    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }
}