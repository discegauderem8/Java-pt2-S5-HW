package org.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Teacher extends User {

    private int exp; //Это хороший класс, соответствует принципам единственной ответственности, открытости/закрытости
    private ArrayList<Integer> groups = new ArrayList<>();//и подстановки Лисков
//    static int defaultTeacherIndex;

    public List<Integer> getGroups() {
        return groups;
    }

    public void addGroup(int groupID) {
        this.groups.add(groupID);
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\n" +
                "ФИО Преподавателя: " + fio + "\n" +
                "Дата рождения: " + dateBirth + "\n" +
                "Стаж преподавания: " + exp + "\n" +
                "Группы преподавателя: " + groups.toString() + "\n";
    }

    Random random = new Random();

    public Teacher(Date birthDate) {
        super(birthDate); //обращение к super должно быть первым выражением в конструкторе!
        this.exp = random.nextInt(0, 30);
    }

}
