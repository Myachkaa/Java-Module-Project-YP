import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        PersonsNumber personsNumber = new PersonsNumber();
        Scanner scanner = new Scanner(System.in);
        personsNumber.personsNumber();
        Calculate calculate = new Calculate();
        while (true) {
            calculate.productInfo();
            System.out.println("Нужно ввести ещё товар? \nЕсли нет - напишите 'Завершить'");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                break;
            }
        }
        double res = calculate.productSum / personsNumber.number;

        String result = String.format("%.2f", res);
        String sum = String.format("%.2f", calculate.productSum);
        System.out.print("Добавленные товары:" + calculate.productInfo + "\nОбщая сумма чека: " + sum);
        double i = Math.floor(calculate.productSum)  % 100 / 10;
        int k = (int) (calculate.productSum) % 10;
        if ((int) (i) == 1) {
            System.out.println(" рублей.");
        } else if (k == 1) {
            System.out.println(" рубль.");
        } else if (k == 2 | k == 3 | k == 4) {
            System.out.println(" рубля.");
        } else {
            System.out.println(" рублей.");
        }
        System.out.print("Каждый человек должен заплатить " + result);
        double y = Math.floor(res) % 100 / 10;
        int x = (int) (res) % 10;
        if ((int) (y) == 1) {
            System.out.println(" рублей.");
        } else if (x == 1) {
            System.out.println(" рубль.");
        } else if (x == 2 | x == 3 | x == 4) {
            System.out.println(" рубля.");
        } else {
            System.out.println(" рублей.");
        }
    }
}

