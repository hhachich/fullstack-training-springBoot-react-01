package fr.hhachich.fullstack_backend_training_springBoot_react_01.service;

import fr.hhachich.fullstack_backend_training_springBoot_react_01.exception.StudentAllreadyExistsException;
import fr.hhachich.fullstack_backend_training_springBoot_react_01.exception.StudentNotFoundException;
import fr.hhachich.fullstack_backend_training_springBoot_react_01.model.Student;
import fr.hhachich.fullstack_backend_training_springBoot_react_01.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        if (studentAllreadyExists(student.getEmail())) {
            throw new StudentAllreadyExistsException(student.getEmail() + " student allready exists");
        }
        return studentRepository.save(student);
    }


    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.findById(id).map(st -> {
            st.setFirstName(student.getFirstName());
            st.setLastName(student.getLastName());
            st.setEmail(student.getEmail());
            st.setDepartement(student.getDepartement());
            return studentRepository.save(st);
        }).orElseThrow(() -> new StudentNotFoundException(" not found this student"));
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(" not found this student"));
    }

    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException(" not found this student");
        }
        studentRepository.deleteById(id);
    }

    private boolean studentAllreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }
}
