package com.flashcard_shreedev.flashcard_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flashcard_shreedev.flashcard_backend.entity.Flashcard;

public interface FlashcardRepository extends JpaRepository<Flashcard, Integer> {
    //Custom query methods can be defined here if needed
    
}
