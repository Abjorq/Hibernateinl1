package se.yrgo;

import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {

        //skapa ett entityManagerFactory-objekt från
        //persistence-unit i persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibInl1");
        EntityManager em = emf.createEntityManager();

        //starta transaktion
        em.getTransaction().begin();


        School school = new School("Yrgo Göteborg");
        Student student1 = new Student("Anton");
        Student student2 = new Student("Nahid");

        //skapa objekten
        school.registerStudent(student1);
        school.registerStudent(student2);

        //spara objekt i databasen med persist()
        em.persist(school);
        em.getTransaction().commit();

        //loopa igenom listan med studenter

        School found = em.find(School.class, school.getId());
        System.out.println("sttudenter på " + found.getName() + ":");
        for (Student student : found.getStudents()) {
            System.out.println("- " + student.getName());
        }


        em.close();
        emf.close();

    }
}
