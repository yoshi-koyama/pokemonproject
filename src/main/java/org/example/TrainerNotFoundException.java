package org.example;

public class TrainerNotFoundException extends RuntimeException {

    public TrainerNotFoundException(String message) {
        super(message);
    }
}