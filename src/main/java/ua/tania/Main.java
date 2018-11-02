package ua.tania;

import ua.tania.auxiliary.StudentContainer;
import ua.tania.auxiliary.StudentQuality;
import ua.tania.entity.Group;
import ua.tania.entity.Professor;
import ua.tania.entity.Student;

import java.util.Scanner;

/**
 * Created by Таня on 31.10.2018.
 */
public class Main {

    public static void main(String[] args) {
        Group tm41 = new Group("TM-41");
        tm41.addStudent(StudentContainer.student1);
        tm41.addStudent(StudentContainer.student2);
        tm41.addStudent(StudentContainer.student3);
        tm41.addStudent(StudentContainer.student4);
        tm41.addStudent(StudentContainer.student5);
        tm41.addStudent(StudentContainer.student6);
        tm41.addStudent(StudentContainer.student7);
        tm41.addStudent(StudentContainer.student8);
        Student captain = tm41.chooseCaptain();
        Professor professor1 = new Professor("Maxim", "Pryluchniy");

        System.out.println("The captain of the group " + tm41.getName() + " has been chosen " + captain.toString());
        System.out.println("Let`s check present student. Input 'yes' if student is present or 'no' if absent." +
                " If you input something different the checking will be interrupted");
        System.out.println("In auditory are present next students: " + professor1.checkPresent(tm41));


    }
}
