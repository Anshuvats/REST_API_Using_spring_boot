package com.example.Bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Bank.model.Bank_model;
public interface Bank_Repo extends JpaRepository<Bank_model, Integer> {
}
