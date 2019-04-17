package com.example.Lab.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Lab.model.Lab;
public interface LabRepo extends JpaRepository<Lab, Integer> {
}


