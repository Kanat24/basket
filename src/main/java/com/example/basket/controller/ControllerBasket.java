package com.example.basket.controller;

import com.example.basket.service.ServiceBasket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/store/order")

public class ControllerBasket {
   private final ServiceBasket serviceBasket;

    public ControllerBasket(ServiceBasket serviceBasket) {
        this.serviceBasket = serviceBasket;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("id")List<Integer>idToAdd){
        this.serviceBasket.addToBasket(idToAdd);
    }
    @GetMapping("/get")
    public List<Integer> getItems(){
        return this.serviceBasket.getItems();
    }
}
