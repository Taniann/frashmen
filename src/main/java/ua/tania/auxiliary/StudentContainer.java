package ua.tania.auxiliary;

import ua.tania.entity.Student;


/**
 * Created by Таня on 01.11.2018.
 */
public class StudentContainer {
    public static Student student1 = new Student("Ivan", "Alekseev",
            StudentQuality.WELL_MANNERED);
    public static Student student2 = new Student("Karina", "Baj",
            StudentQuality.WELL_MANNERED, StudentQuality.SMART);
    public static Student student3 = new Student("Vladyslav", "Binchuck",
            StudentQuality.WELL_MANNERED, StudentQuality.SMART);
    public static Student student4 = new Student("Bob", "Bobov",
            StudentQuality.WELL_MANNERED, StudentQuality.SMART, StudentQuality.RESPONSIBLE);
    public static Student student5 = new Student("Ihor", "Polishchuk",
            StudentQuality.WELL_MANNERED, StudentQuality.LEADERSHIP_ABILITY, StudentQuality.RESPONSIBLE);
    public static Student student6 = new Student("Maryna", "Storozh",
            StudentQuality.LEADERSHIP_ABILITY, StudentQuality.UNLAWFUL);
    public static Student student7 = new Student("Alina", "Simple",
            StudentQuality.WELL_MANNERED);
    public static Student student8 = new Student("Max", "Maxymenko",
            StudentQuality.UNLAWFUL, StudentQuality.RUDE);


    private StudentContainer() {
    }
}
