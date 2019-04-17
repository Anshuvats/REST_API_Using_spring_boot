package com.example.Bank.controller;
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

import com.example.Bank.model.Bank_model;

import com.example.Bank.repository.Bank_Repo;
@RestController
@RequestMapping
public class Bank_controller {

@Autowired
Bank_Repo bank_Repo;
@GetMapping(path="getAllBank")
public List<Bank_model> findAllBank(){
return bank_Repo.findAll();
}
@RequestMapping(method=RequestMethod.POST, value="addBank")
public Bank_model addBank(@RequestBody Bank_model bank) {
return bank_Repo.save(bank);
}
@DeleteMapping("/deleteBank/{id}")
public String deleteGrocery_shop(@PathVariable int id) {
bank_Repo.deleteById(id);
return "Successfully Deleted";
}
@PutMapping("/updateBank/{id}")
public ResponseEntity<Object> updateBank(@RequestBody Bank_model bank,
@PathVariable int id) {
Optional<Bank_model> bankOptional = bank_Repo.findById(id);
if (!bankOptional.isPresent())
return ResponseEntity.notFound().build();
bank.setId(id);
bank_Repo.save(bank);
return ResponseEntity.noContent().build();
}
}
