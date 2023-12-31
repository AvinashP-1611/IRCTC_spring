package com.example.IRCTC.Services;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import com.example.IRCTC.Repositories.PassengerRepo;
import com.example.IRCTC.Repositories.TrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    TrainService trainService;
    @Autowired
    PassengerRepo passengerRepo;

    @Autowired
    TrainRepo trainRepo;

    public String addPassenger(Passenger passenger, int id) {

        Train t=trainRepo.findById(id);
        passenger.setTrain(t);
//        if train doesnot exits then ----
//         ......pending
//        else

        List<Passenger> p=new ArrayList<>();
        p.add(passenger);
        t.setPassengerList(p);
        passengerRepo.save(passenger);
        return "Passenger save successfully";
    }

    public int findByDate(String source, String dest, String date) {
        List<Passenger> p=passengerRepo.findAll();
        int count=0;
        for(Passenger l:p){
            Train t=l.getTrain();
            if(t.getDestination()==dest && t.getSource()==source && String.valueOf(l.getDate())==date){
               count++;
            }
        }
        return count;
   }


//   Second question
    public int findFemale(int x, int y, String dest) {
        List<Passenger> p=passengerRepo.findAll();
        int count=0;
        for(Passenger l:p) {
            Train t = l.getTrain();
            if(l.getGender().equals("FEMALE") && (l.getAge()>=x && l.getAge()<=y) && t.getDestination()==dest)
                count++;
        }
        return count;
    }
}
