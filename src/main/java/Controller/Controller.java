package Controller;

import View.ConsoleView;
import org.Model.Student;
import org.Model.StudyGroupService;
import org.Model.Teacher;
import org.Model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Controller {
    ArrayList<ArrayList<User>> dataCollector = new ArrayList<>();
    ConsoleView consoleView;

    public Controller(ConsoleView thisConsoleView) {//Передаем тип ConsoleView в качестве аргумента, чтобы избежать
        this.consoleView = thisConsoleView;//ошибок при изменении типа вывода, а View, в свою очередь наследует
    }                                      // от интерфейса ViewType.
                                           //Похожее нам показывали на лекции как пример принципа инверсии зависимостей


    public void execute() {
        Scanner scanner = new Scanner(System.in);
//        View view = thisView;
        StudyGroupService sgs = new StudyGroupService();

        while (true) {
            System.out.println("\n");
            System.out.println("1 - Создать учебную группу с одним преподавателем\n" +
                    "2 - Создать учебную группу с несколькими преподавателями\n" +
                    "3 - Вывести ID всех ранее внесенных в базу данных преподавателей и учеников\n" +
                    "4 - Вывести преподавателей и учеников по ID группы\n" +
                    "5 - Вывести ID всех студентов и преподавателей группы\n" +
                    "6 - Выйти из программы");

            int decision = scanner.nextInt();

            if (decision == 1) {
                if (sgs.getGroupID() < 10) { // Ограничение числа групп
                    System.out.println("Введите число учеников:");
                    int studentNumber = scanner.nextInt();
                    ArrayList<Student> newStudents = new ArrayList<Student>();
                    for (int i = 0; i < studentNumber; i++) {
                        newStudents.add(new Student(new Date()));
                    }

                    ArrayList<User> newStudyGroup = sgs.createStudentGroup(new Teacher(new Date()), newStudents);
                    dataCollector.add(newStudyGroup);

                    System.out.println("Вы хотите вывести внесенные данные на экран? 1 - да, любая другая цифра - нет");
                    int decision2 = scanner.nextInt();
                    if (decision2 == 1) {
                        System.out.println(consoleView.print(newStudyGroup));
                    }
                } else {
                    System.out.println("Вы достигли максимального числа групп");
                }
            } else if (decision == 2) {
                if (sgs.getGroupID() < 10) {
                    ArrayList<Student> theseNewStudents = new ArrayList<>();
                    ArrayList<Teacher> theseNewTeachers = new ArrayList<>();
                    System.out.println("Введите число учеников:");
                    int theseStudentsNumber = scanner.nextInt();
                    System.out.println("Введите число учителей:");
                    int theseTeachersNumber = scanner.nextInt();

                    for (int i = 0; i < theseStudentsNumber; i++) {
                        theseNewStudents.add(new Student(new Date()));
                    }
                    for (int i = 0; i < theseTeachersNumber; i++) {
                        theseNewTeachers.add(new Teacher(new Date()));
                    }
                    ArrayList<User> theseNewStudyGroup = sgs.createStGrWithSomeTeachers(theseNewTeachers, theseNewStudents);
                    dataCollector.add(theseNewStudyGroup);

                    System.out.println("Вы хотите вывести внесенные данные на экран? 1 - да, любая другая цифра - нет");
                    int decision2 = scanner.nextInt();
                    if (decision2 == 1) {
                        System.out.println(consoleView.print(theseNewStudyGroup));
                    }
                }else {
                    System.out.println("Вы достигли максимального числа групп");
                }
            } else if (decision == 3) {
                for (ArrayList<User> subArray : dataCollector) {
                    consoleView.print(subArray);
                }
            } else if (decision == 4) {
                System.out.println("Введите ID искомой группы: ");
                int targetID = scanner.nextInt();
                for (ArrayList<User> subArray : dataCollector) {
                    for (User user : subArray) {
                        if (user instanceof Student && ((Student) user).getGroupID() == targetID) {
                            System.out.println(user);
                        } else if (user instanceof Teacher && ((Teacher) user).getGroups().contains(targetID)) {
                            System.out.println(user);
                        }
                    }
                }
            } else if (decision == 5) {
                System.out.println("Введите ID искомой группы: ");
                int targetID = scanner.nextInt();
                for (ArrayList<User> subArray : dataCollector) {
                    for (User user : subArray) {
                        if (user instanceof Student && ((Student) user).getGroupID() == targetID) {
                            System.out.println(((User) user).getID());
                        } else if (user instanceof Teacher && ((Teacher) user).getGroups().contains(targetID)) {
                            System.out.println(((User) user).getID());
                        }
                    }
                }
            } else if (decision == 6) {
                break;
            }
        }
        scanner.close();
    }
}
