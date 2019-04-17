package com.example.Grocery_shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Grocery_shop.model.Grocery_shop_model;
public interface Grocery_shop_Repo extends JpaRepository<Grocery_shop_model, Integer> {
}



