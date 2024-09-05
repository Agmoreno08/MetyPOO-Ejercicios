import models.Admision;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public main(String[] args) {
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<>();
        Admision admision = new Admision();
        Scanner sc = new Scanner(System.in);
        Float promedio;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el promedio del studente: ");
            promedio = sc.nextFloat();
            student.setAverage(promedio);
            admision.calSchoolarship(student);
            students.add(student);
        }
        for (Student s : students) {}
        System.out.println(student.isSchoolarship());
    }
}
