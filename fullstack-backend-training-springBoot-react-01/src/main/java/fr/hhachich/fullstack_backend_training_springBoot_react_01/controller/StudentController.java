package fr.hhachich.fullstack_backend_training_springBoot_react_01.controller;

import fr.hhachich.fullstack_backend_training_springBoot_react_01.model.Student;
import fr.hhachich.fullstack_backend_training_springBoot_react_01.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/studends")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;

    @GetMapping
    public List<Student>getStudents(){
        return studentService.getStudents();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable Long id){
        return studentService.updateStudent(student,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
         studentService.deleteStudent(id);
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

}
