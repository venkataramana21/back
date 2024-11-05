package com.example.moodtrackerbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoodEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;
    private int moodScore;
    private String journalEntry;
    private int sleepHours;
    private int waterIntake;
    private LocalDate entryDate;
}
