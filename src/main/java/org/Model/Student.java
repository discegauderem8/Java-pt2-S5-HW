package org.Model;

import java.util.Date;
import java.util.List;

public class Student extends User{

    private String name;
    private int groupID; //Это хороший класс, соответствует принципу единственной ответственности
    public int getGroupID() {
        return groupID;
    }//принципу открытости/закрытости и принципу подстановки Лисков

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

}
