package ua.tania.entity;

import ua.tania.auxiliary.StudentQuality;

import java.util.*;

/**
 * Created by Таня on 31.10.2018.
 */
public class Group {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
        }
    }

    public Student chooseCaptain() {
        int scoreResult = 0;
            for (Student student : students) {
                Set<StudentQuality> qualities = student.getQualities();
                if (qualities.contains(StudentQuality.WELL_MANNERED)) scoreResult++;
                if (qualities.contains(StudentQuality.RESPONSIBLE)) scoreResult++;
                if (qualities.contains(StudentQuality.SMART)) scoreResult++;
                if (qualities.contains(StudentQuality.LEADERSHIP_ABILITY)) scoreResult++;
                if (qualities.contains(StudentQuality.RUDE)) scoreResult--;
                if (qualities.contains(StudentQuality.UNLAWFUL)) scoreResult--;
                student.setQualityScore(scoreResult);
                scoreResult = 0;
            }
         return students.stream().max(Comparator.comparingInt(Student::getQualityScore)).get();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
