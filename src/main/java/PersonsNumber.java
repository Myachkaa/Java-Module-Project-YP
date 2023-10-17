import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonsNumber {
    int number;
    void personsNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Сколько человек будет оплачивать счёт?");
        number = 0;
        boolean isNumber;
        do {
            isNumber = true;
            String string = bufferedReader.readLine();

            try {
                number = Integer.parseInt(string);
                if (number <= 1) {
                    System.out.println("Количество человек должно быть более одного.");
                    isNumber = false;
                }
            } catch (Exception exception) {
                isNumber = false;

                System.out.println("Введено недопустимое значение.\nПожалуйста, введите число.");
            }
        }
        while (!isNumber);
        if (number < 5) {
            System.out.println("Отлично!\nБудем делить на " + number + " персоны.");
        } else {
            System.out.println("Отлично!\nБудем делить на " + number + " персон.");
        }
    }
}
