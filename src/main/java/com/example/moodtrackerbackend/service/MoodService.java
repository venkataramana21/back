package com.example.moodtrackerbackend.service;

import com.example.moodtrackerbackend.entity.MoodEntry;
import com.example.moodtrackerbackend.repository.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MoodService {
    @Autowired
    MoodRepository moodRepository;
    public List<MoodEntry> getMoodEntriesByUser(String userId) {
        return moodRepository.findByUserId(userId);
    }

    public MoodEntry saveMoodEntry(MoodEntry moodEntry) {
        moodEntry.setEntryDate(LocalDate.now());
        return moodRepository.save(moodEntry);
    }

    public void deleteMoodEntry(Long id) {
        moodRepository.deleteById(id);
    }
}
