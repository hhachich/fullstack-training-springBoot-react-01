package fr.hhachich.fullstack_backend_training_springBoot_react_01.exception;

public class StudentAllreadyExistsException extends RuntimeException {
    public StudentAllreadyExistsException(String message) {
        super(message);
    }
}
