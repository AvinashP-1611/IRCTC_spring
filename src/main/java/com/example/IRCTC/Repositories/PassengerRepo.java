package com.example.IRCTC.Repositories;

import com.example.IRCTC.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer> {

    List<Passenger> findAll();


}
