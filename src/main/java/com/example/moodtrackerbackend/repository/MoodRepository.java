package com.example.moodtrackerbackend.repository;

import com.example.moodtrackerbackend.entity.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoodRepository  extends JpaRepository<MoodEntry,Long> {
    List<MoodEntry> findByUserId(String userId);
}
