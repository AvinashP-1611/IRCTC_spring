package com.example.IRCTC.Models;

import com.example.IRCTC.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int passengerId;

    Date date;

    int age;

//    int ticketId;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @ManyToOne
    @JoinColumn(name = "trainId")
    Train train;

//    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
//    List<Food> foodList = new ArrayList<>();
}