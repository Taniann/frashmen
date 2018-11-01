package ua.tania.auxiliary;

import ua.tania.entity.Student;


/**
 * Created by Таня on 01.11.2018.
 */
public class StudentContainer {
    public static Student student1 = new Student("Ivan", "Alekseev",
            StudentQuality.WELL_MANNERED);
    public static Student student2 = new Student("Vladyslav", "Binchuck",
            StudentQuality.WELL_MANNERED, StudentQuality.SMART);

    private StudentContainer() {
    }
}
