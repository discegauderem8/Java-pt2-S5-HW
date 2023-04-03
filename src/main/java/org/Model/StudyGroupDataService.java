package org.Model;

import java.util.ArrayList;
import java.util.List;

public interface StudyGroupDataService {

    public ArrayList<User> createStudentGroup (Teacher groupTeacher, List<Student> groupStudents);
    public ArrayList<User> createStGrWithSomeTeachers (ArrayList<Teacher> groupTeachers, List<Student> groupStudents);
}
