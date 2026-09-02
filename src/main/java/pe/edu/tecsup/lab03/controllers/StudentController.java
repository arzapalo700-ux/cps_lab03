package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void showStudentInfo(Long id) {
        StudentEntity student = service.getStudent(id);
        System.out.println("Estudiante: " + student.getName() + " | Correo: " + student.getEmail());
    }
}

// Colaborador: Sebastian Espiritu