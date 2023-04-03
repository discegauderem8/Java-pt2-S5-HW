package View;

import org.Model.User;

import java.util.List;

public class View implements ViewType{

    public View() {
//        System.out.println("View создан");
    }

    public String print(List<User> userList){
        return userList.toString();
    }
//    public String teacherView(List<Teacher> teacherList){
//        return teacherList.toString();
//    }
}
