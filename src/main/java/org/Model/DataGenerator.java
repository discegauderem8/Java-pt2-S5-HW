package org.Model;

import java.util.Random;

public class DataGenerator {
    public String generateName() {
        Random random = new Random();
        int factor1 = random.nextInt(1, 6);
        int factor2 = random.nextInt(1, 6);
        StringBuilder strBld2 = new StringBuilder();
        if (factor1 == 1) { //Почему-то switch(case) тут работает криво и разные имена нагромождаются в одно...
            strBld2.append("Иван "); //(ниже закоменчен пример, почекай)
        } else if (factor1 == 2) {
            strBld2.append("Александр ");
        } else if (factor1 == 3) {
            strBld2.append("Сергей ");
        } else if (factor1 == 4) {
            strBld2.append("Роман ");
        } else if (factor1 == 5) {
            strBld2.append("Алексей ");
        }

        if (factor2 == 1) { //Почему-то switch(case) тут работает криво и разные имена нагромождаются в одно...
            strBld2.append("Петров "); //(ниже закоменчен пример, почекай)
        } else if (factor2 == 2) {
            strBld2.append("Сидоров ");
        } else if (factor2 == 3) {
            strBld2.append("Иванов ");
        } else if (factor2 == 4) {
            strBld2.append("Романенко ");
        } else if (factor2 == 5) {
            strBld2.append("Мягков ");
        }
//        switch (factor2) {
//            case 1:
//                strBld2.append("Петров ");
//            case 2:
//                strBld2.append("Сидоров ");
//            case 3:
//                strBld2.append("Иванов ");
//            case 4:
//                strBld2.append("Романенко ");
//            case 5:
//                strBld2.append("Мягков ");
//        }
        return strBld2.toString();
    }



}
