package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

public class StudentService {
    private StudentRepository repository = new StudentRepository();

    public StudentEntity getStudent(Long id) {
        return repository.findById(id);
    }
}