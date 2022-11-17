package com.example.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> userBasket= new ArrayList<>();

    public void addToBasket(List<Integer> idToAdd){
        userBasket.addAll(idToAdd);
    }
    public List<Integer> getBasketContent(){
        return Collections.unmodifiableList(userBasket);
    }
}
