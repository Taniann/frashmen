package ua.tania.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Таня on 31.10.2018.
 */
public class Auditory {
    private String number;
    private Professor professor;
    private Group group;
    private List<Student> presentStudents = new ArrayList<>();


    public Auditory(String number, Professor professor, Group group) {
        this.number = number;
        this.professor = professor;
        this.group = group;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
