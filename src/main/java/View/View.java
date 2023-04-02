package View;

import org.Model.Student;
import org.Model.Teacher;
import org.Model.User;

import java.util.List;

public class View {

    public View() {
//        System.out.println("View создан");
    }

    public String userView(List<User> userList){
        return userList.toString();
    }
//    public String teacherView(List<Teacher> teacherList){
//        return teacherList.toString();
//    }
}
