package org.Model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public static int nextGroupID = 0;
    private Teacher groupTeacher;
    private List<Student> groupStudents;

    public StudyGroupService() {
    }
    public int getGroupID() {
        return nextGroupID;
    }
    public ArrayList<User> createStudentGroup (Teacher groupTeacher, List<Student> groupStudents){
        nextGroupID++;
        ArrayList<User> studentGroup = new ArrayList<>();
        studentGroup.add(groupTeacher);
        groupTeacher.addGroup(nextGroupID);
        for (Student s: groupStudents) {
            studentGroup.add(s);
            s.setGroupID(nextGroupID);
        }
        return studentGroup;
    }
    public ArrayList<User> createStGrWithSomeTeachers (ArrayList<Teacher> groupTeachers, List<Student> groupStudents){
        nextGroupID++;
        ArrayList<User> studentGroup = new ArrayList<>();

        for (Teacher t: groupTeachers) {
            studentGroup.add(t);
            t.addGroup(nextGroupID);
        }
        for (Student s: groupStudents) {
            studentGroup.add(s);
            s.setGroupID(nextGroupID);
        }
        return studentGroup;
    }

}
