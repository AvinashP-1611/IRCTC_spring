package com.example.IRCTC.Controllers;

import com.example.IRCTC.Services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    FoodService foodService;

//    @GetMapping("/findByTrainId/{trainId}")
//    public ResponseEntity findById(@PathVariable ("trainId") int id){
//        int price=foodService.findById(id);
//        return new ResponseEntity<>(price, HttpStatus.FOUND);
//    }
}
