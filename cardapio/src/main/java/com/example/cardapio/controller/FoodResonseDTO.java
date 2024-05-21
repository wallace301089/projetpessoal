package com.example.cardapio.controller;

public record FoodResonseDTO(Long id,String title,String image,Integer price) {
    public FoodResonseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
