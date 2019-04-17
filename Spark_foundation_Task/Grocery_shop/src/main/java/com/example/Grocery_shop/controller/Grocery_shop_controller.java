package com.example.Grocery_shop.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Grocery_shop.model.Grocery_shop_model;

import com.example.Grocery_shop.repository.Grocery_shop_Repo;
@RestController
@RequestMapping
public class Grocery_shop_controller {

@Autowired
Grocery_shop_Repo grocery_shop_Repo;
@GetMapping(path="getAllGrocery_shop")
public List<Grocery_shop_model> findAllGrocery_shop(){
return grocery_shop_Repo.findAll();
}
@RequestMapping(method=RequestMethod.POST, value="addGrocery_shop")
public Grocery_shop_model addGrocery_shop(@RequestBody Grocery_shop_model grocery_shop) {
return grocery_shop_Repo.save(grocery_shop);
}
@DeleteMapping("/deleteGrocery_shop/{id}")
public String deleteGrocery_shop(@PathVariable int id) {
grocery_shop_Repo.deleteById(id);
return "Successfully Deleted";
}
@PutMapping("/updateGrocery_shop/{id}")
public ResponseEntity<Object> updateGrocery_shop(@RequestBody Grocery_shop_model grocery_shop,
@PathVariable int id) {
Optional<Grocery_shop_model> grocery_shopOptional = grocery_shop_Repo.findById(id);
if (!grocery_shopOptional.isPresent())
return ResponseEntity.notFound().build();
grocery_shop.setId(id);
grocery_shop_Repo.save(grocery_shop);
return ResponseEntity.noContent().build();
}
}
