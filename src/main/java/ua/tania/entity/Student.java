package ua.tania.entity;

import ua.tania.auxiliary.StudentQuality;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Таня on 31.10.2018.
 */
public class Student {
    private static int idCount = 1;
    private int id;
    private String name;
    private String surname;
    private int qualityScore;
    private Set<StudentQuality> qualities = new HashSet<>();
    private boolean isCaptain;


    public Student(String name, String surname, Set<StudentQuality> qualities) {
        this.id = idCount++;
        this.name = name;
        this.surname = surname;
        this.qualities = qualities;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  int getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(int qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Set<StudentQuality> getQualities() {
        return qualities;
    }

    public void setQualities(Set<StudentQuality> qualities) {
        this.qualities = qualities;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
