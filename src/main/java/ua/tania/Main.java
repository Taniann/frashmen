package ua.tania;

import ua.tania.auxiliary.StudentQuality;
import ua.tania.entity.Group;
import ua.tania.entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Таня on 31.10.2018.
 */
public class Main {

    public static void main(String[] args) {
        Set<StudentQuality> qualities = new HashSet<>();
        qualities.add(StudentQuality.WELL_MANNERED);
        qualities.add(StudentQuality.SMART);
        Student student1 = new Student("Tania", "Nebesna", qualities);
        Set<StudentQuality> qualities2 = new HashSet<>();
        qualities2.add(StudentQuality.RUDE);
        qualities2.add(StudentQuality.SMART);
        qualities2.add(StudentQuality.LEADERSHIP_ABILITY);
        qualities2.add(StudentQuality.RESPONSIBLE);
        qualities2.add(StudentQuality.WELL_MANNERED);
        Student student2 = new Student("Vlad", "Ddd", qualities2);
        Group tm41 = new Group("TM-41");
        tm41.getStudents().add(student1);
        tm41.getStudents().add(student2);
        Student result = tm41.chooseCaptain();
        System.out.println(result.toString());

    }
}
