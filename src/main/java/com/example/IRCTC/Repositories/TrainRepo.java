package com.example.IRCTC.Repositories;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepo extends JpaRepository<Train,Integer> {


    Train findById(int id);
//    Train findByTrainId(int id);
}
