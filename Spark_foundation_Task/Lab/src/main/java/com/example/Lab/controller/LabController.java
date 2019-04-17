package com.example.Lab.controller;
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

import com.example.Lab.model.Lab;

import com.example.Lab.repository.LabRepo;
@RestController
@RequestMapping
public class LabController {
@Autowired
LabRepo labRepo;
@GetMapping(path="getAllLab")
public List<Lab> findAllLab(){
return labRepo.findAll();
}
@RequestMapping(method=RequestMethod.POST, value="addLab")
public Lab addLab(@RequestBody Lab lab) {
return labRepo.save(lab);
}
@DeleteMapping("/deleteLab/{id}")
public String deleteLab(@PathVariable int id) {
labRepo.deleteById(id);
return "Successfully Deleted";
}
@PutMapping("/updateLab/{id}")
public ResponseEntity<Object> updateLab(@RequestBody Lab lab,
@PathVariable int id) {
Optional<Lab> labOptional = labRepo.findById(id);
if (!labOptional.isPresent())
return ResponseEntity.notFound().build();
lab.setId(id);
labRepo.save(lab);
return ResponseEntity.noContent().build();
}
}
