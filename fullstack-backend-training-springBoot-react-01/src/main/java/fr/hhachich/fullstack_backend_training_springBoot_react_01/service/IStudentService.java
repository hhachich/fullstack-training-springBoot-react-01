package fr.hhachich.fullstack_backend_training_springBoot_react_01.service;

import fr.hhachich.fullstack_backend_training_springBoot_react_01.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
