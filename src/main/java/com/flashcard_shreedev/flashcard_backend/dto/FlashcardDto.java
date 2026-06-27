package com.flashcard_shreedev.flashcard_backend.dto;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class FlashcardDto {
    private Integer id;
    private String question;
    private String answer;
    private String category;
    private Integer masteryProgress;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMasteryProgress() {
        return masteryProgress;
    }

    public void setMasteryProgress(Integer masteryProgress) {
        this.masteryProgress = masteryProgress;
    }
}
