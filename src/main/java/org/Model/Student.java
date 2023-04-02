package org.Model;

import java.util.Date;
import java.util.List;

public class Student extends User{

    private String name;
    private int groupID;
//    static int defaultStudentIndex;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int ID) {
        groupID = ID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + "\n" +
                "ФИО Ученика: " + fio + "\n" +
                "Дата рождения: " + dateBirth + "\n" +
                "Группа ученика: " + groupID + "\n";
    }

    List<Integer> grades;
    public Student(Date birthDate) {
        super(birthDate);
    }
//    public Student(){
//        super(new Date(), "unidentified_student_" + ++defaultStudentIndex);
//    }
}
