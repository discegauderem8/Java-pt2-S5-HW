package org.Model;

import java.util.Random;

public class DataGenerator implements NameGenerationInterface {

    @Override
    public String generateName() { //Сделал отдельный интерфейс для генерации имени для реализации принципа
        Random random = new Random(); // инверсии зависимости. Иными словами, нам не придется переписывать этот
        int factor1 = random.nextInt(1, 6); // метод, если мы захотим расширить его функционал,
        int factor2 = random.nextInt(1, 6); //мы сможем просто реализовать новые интерфейсы.
        StringBuilder strBld2 = new StringBuilder();
        if (factor1 == 1) {
            strBld2.append("Иван ");
        } else if (factor1 == 2) {
            strBld2.append("Александр ");
        } else if (factor1 == 3) {
            strBld2.append("Сергей ");
        } else if (factor1 == 4) {
            strBld2.append("Роман ");
        } else if (factor1 == 5) {
            strBld2.append("Алексей ");
        }
        switch (factor2) { //P.S. Еще я сделал нормальный свитч-кейс для фамилий)))))))))))))
            case 1:
                strBld2.append("Петров ");
                break;
            case 2:
                strBld2.append("Сидоров ");
                break;
            case 3:
                strBld2.append("Иванов ");
                break;
            case 4:
                strBld2.append("Романенко ");
                break;
            case 5:
                strBld2.append("Мягков ");
                break;
        }
        return strBld2.toString();
    }
}
