package se.yrgo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

//klass förr skola
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    //en skola har många studenter
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public School() {}
    public School(String name) {
        this.name = name;
    }

    public void registerStudent(Student student) {
        students.add(student);
        student.setSchool(this);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
