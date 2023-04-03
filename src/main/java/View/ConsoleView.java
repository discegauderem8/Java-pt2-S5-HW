package View;

import org.Model.User;

import java.util.List;

public class ConsoleView implements ViewType{

    public ConsoleView() { //См Controller для подробностей рефакторинга
    }

    public String print(List<User> userList){
        return userList.toString();
    }
}
