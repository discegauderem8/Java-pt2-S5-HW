package org.Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class User {
    Date dateBirth;
    String fio;
    int ID;
    static ArrayList<Integer> usedIDs = new ArrayList<>();
    static int userCount = 0;

    public User(Date dateBirth) {
        Random random = new Random();
        DataGenerator dg = new DataGenerator();
        this.fio = dg.generateName();

        int identifier = random.nextInt(1000,10000);
        while (usedIDs.contains(identifier) && usedIDs != null){
            identifier = random.nextInt(1000,10000);
        }
        usedIDs.add(identifier);

        this.ID = identifier;
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.userCount = ++userCount;
    }
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "dateBirth = " + dateBirth +
                ", fio = '" + fio + '\'' +
                ", ID = " + ID +
                '}' + "\n";
    }
}