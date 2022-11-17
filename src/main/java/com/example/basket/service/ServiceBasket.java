package com.example.basket.service;

import com.example.basket.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceBasket {
    private final Basket basket;

    public ServiceBasket(Basket basket) {
        this.basket = basket;
    }

    public void addToBasket(List<Integer> idToAdd) {
       basket.addToBasket(idToAdd);
    }

    public List<Integer> getItems() {
        return basket.getBasketContent();
    }
}
