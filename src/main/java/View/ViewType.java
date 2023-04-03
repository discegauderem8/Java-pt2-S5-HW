package View;

import org.Model.User;

import java.util.List;

public interface ViewType {
    public String print(List<User> userList);
}
