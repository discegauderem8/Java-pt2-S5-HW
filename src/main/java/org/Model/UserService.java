package org.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class UserService implements DataService {
    Random random = new Random();
    @Override
    public Student createStudent() {//Это хороший класс, он реализует принципы инверсии зависимостей
        return new Student(new Date());//и разделения интерфейса
    }

    @Override
    public Teacher createTeacher() {
        return new Teacher(new Date());
    }

    public ArrayList<User> multicreate(int teacherCount, int studentCount){
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < teacherCount; i++) {
            userList.add(new Teacher(new Date()));
        }
        for (int i = 0; i < studentCount; i++) {
            userList.add(new Student(new Date()));
        }
        return userList;
    }
}
