package ua.tania.entity;

import ua.tania.auxiliary.Subject;

import java.util.List;

/**
 * Created by Таня on 31.10.2018.
 */
public class Professor {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;
    private Subject subject;

    public Professor(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

/*    public List<Student> checkPresent(Group group) {
        for (Student student : group.getStudents()) {
        }
    }*/
}
