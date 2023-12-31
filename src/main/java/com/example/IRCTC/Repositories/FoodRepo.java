package com.example.IRCTC.Repositories;

import com.example.IRCTC.Models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Food,Integer> {
}
