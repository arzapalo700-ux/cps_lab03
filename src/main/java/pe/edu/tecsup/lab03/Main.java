package pe.edu.tecsup.lab03;

import pe.edu.tecsup.lab03.controllers.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.showStudentInfo(1L);
    }
}