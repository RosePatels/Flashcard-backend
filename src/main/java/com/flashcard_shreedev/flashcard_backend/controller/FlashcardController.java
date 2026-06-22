package com.flashcard_shreedev.flashcard_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.flashcard_shreedev.flashcard_backend.dto.FlashcardDto;
import com.flashcard_shreedev.flashcard_backend.entity.Flashcard;
import com.flashcard_shreedev.flashcard_backend.repository.FlashcardRepository;

@RestController
@RequestMapping("/api/flashcards")
@CrossOrigin(origins = "http://localhost:5173") //Allow CORS for the frontend running on localhost:5173
public class FlashcardController {

    @Autowired
    private FlashcardRepository flashcardRepository;
    
    @GetMapping
    public List<FlashcardDto> getAllFlashcards() {
        return flashcardRepository.findAll().stream().map(fc -> {
            FlashcardDto flashcardDto = new FlashcardDto();
            flashcardDto.setId(fc.getId());
            flashcardDto.setQuestion(fc.getQuestion());
            flashcardDto.setAnswer(fc.getAnswer());
            flashcardDto.setCategory(fc.getCategory());
            return flashcardDto;
        }).toList();
    }
}
