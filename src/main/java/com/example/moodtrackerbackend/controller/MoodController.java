package com.example.moodtrackerbackend.controller;

import com.example.moodtrackerbackend.entity.MoodEntry;
import com.example.moodtrackerbackend.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mood")
@CrossOrigin(origins = "http://localhost:3000")
public class MoodController {
    @Autowired
    MoodService moodService;
    @GetMapping("/entries")
    public List<MoodEntry> getMoodEntries(@RequestParam String userId) {
        return moodService.getMoodEntriesByUser(userId);
    }

    @PostMapping("/save")
    public MoodEntry saveMoodEntry(@RequestBody MoodEntry moodEntry) {
        return moodService.saveMoodEntry(moodEntry);
    }

    @DeleteMapping("/entries/{id}")
    public void deleteMoodEntry(@PathVariable Long id) {
        moodService.deleteMoodEntry(id);
    }
}
