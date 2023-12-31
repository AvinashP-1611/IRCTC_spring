package com.example.IRCTC.Controllers;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Services.PassengerService;
import com.example.IRCTC.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @Autowired
    TrainService trainService;

    @PostMapping("/addPassenger")
    public ResponseEntity addPassenger(@RequestBody Passenger passenger, @RequestParam int id){
        String savepassenger=passengerService.addPassenger(passenger,id);
        return new ResponseEntity(savepassenger, HttpStatus.CREATED);
    }

    @GetMapping("/findByDate")
    public ResponseEntity findByDate(@RequestParam String source, @RequestParam String dest, @RequestParam String date ){
        int NoOfpassenger=passengerService.findByDate(source,dest,date);
        return new ResponseEntity(NoOfpassenger, HttpStatus.FOUND);
    }

    @GetMapping("/findFemale")
    public ResponseEntity findFemale(@RequestParam int x, @RequestParam int y, @RequestParam String dest ){
        int NoOfpassenger=passengerService.findFemale(x,y,dest);
        return new ResponseEntity(NoOfpassenger, HttpStatus.FOUND);
    }

//    @GetMapping("/findByTrainId")
//    public ResponseEntity findBySaD(@RequestParam int id) {
//        List<Passenger> passengers = trainService.findByTrainId(id);
//        return new ResponseEntity(passengerList, HttpStatus.FOUND);
//
//    }

}
