package org.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class UserService implements DataService {
    Random random = new Random();
    @Override
    public Student createStudent() {//тут создается дополнительный экземпляр
        int factor1 = random.nextInt(1, 6);
        int factor2 = random.nextInt(1, 6);

        return new Student(new Date());
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

//    @Override
//    public List<User> read(List<User> users) {
//        return null;
//    }
}
