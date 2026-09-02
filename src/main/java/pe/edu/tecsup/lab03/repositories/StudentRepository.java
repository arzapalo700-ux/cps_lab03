package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

public class StudentRepository {
    public StudentEntity findById(Long id) {
        // Simulación de búsqueda en base de datos
        return new StudentEntity(id, "Juan Pérez", "juan.perez@tecsup.edu.pe");
    }
}
