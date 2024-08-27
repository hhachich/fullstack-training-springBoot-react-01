package fr.hhachich.fullstack_backend_training_springBoot_react_01.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
