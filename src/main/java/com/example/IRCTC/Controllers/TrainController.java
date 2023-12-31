package com.example.IRCTC.Controllers;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import com.example.IRCTC.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {
    @Autowired
    TrainService trainService;

    @PostMapping("/addTrain")
    public ResponseEntity addTrain(@RequestBody Train train) {
        String train1 = trainService.addTrain(train);
        return new ResponseEntity(train1, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity getTrainById(@RequestParam int id) {
        Train t = trainService.getTrainById(id);
        return new ResponseEntity(t, HttpStatus.CREATED);
    }

}
