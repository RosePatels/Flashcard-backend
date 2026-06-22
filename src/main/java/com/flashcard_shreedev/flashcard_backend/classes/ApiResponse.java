package com.flashcard_shreedev.flashcard_backend.classes;

public class ApiResponse {
    public boolean success;
    public String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
