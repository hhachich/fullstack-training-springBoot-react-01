package fr.hhachich.fullstack_backend_training_springBoot_react_01.repository;

import fr.hhachich.fullstack_backend_training_springBoot_react_01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> findByEmail(String email);
}
