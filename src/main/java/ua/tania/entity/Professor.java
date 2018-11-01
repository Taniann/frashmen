package ua.tania.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Таня on 31.10.2018.
 */
public class Professor {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Professor(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public List<Student> checkPresent(Group group) {
        List<Student> result = new ArrayList<>();
        List<Student> studentList = group.getStudents();
        int forRandom = 0;
        for(Student student : studentList) {
            if ((forRandom = 0 + (int) (Math.random() * 3)) > 0) {
                result.add(student);
            }
        }
        return result;
    }
}
