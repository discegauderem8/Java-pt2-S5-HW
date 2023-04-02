package org.Model;

import java.util.List;

public interface DataService {
    User createStudent (); //вроде как методы, которые переопределеют классы, имплементирующие интерфейс статичны
    User createTeacher (); //по крайней мере, тут это ТОЧНО работает так

}
