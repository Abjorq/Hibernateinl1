package se.yrgo;

import jakarta.persistence.*;

//klass för studenten
@Entity
public class Student {

    //markera pimärnyckel
    @Id
    //generera nytt värde för id med IDENTITY vid
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //flera studenter kan tillhöra en skola
    @ManyToOne
    //koppla "school" till kolumnen school_id i student-tabellen
    @JoinColumn(name = "school_id")
    private School school;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }
}
