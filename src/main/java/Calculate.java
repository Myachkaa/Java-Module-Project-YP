import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Calculate {
    Scanner scanner = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String productName;
    double productCost = 0;
    String productInfo = "";
    double productSum = 0;

    void productInfo() throws IOException {
        System.out.println("Введите, пожалуйста, наименование товара.");
        productName = scanner.next();
        productInfo = productInfo + " \n" + productName;

        System.out.println("Введите, пожалуйста, стоимость товара.");
        boolean isNumber;
        do {
            isNumber = true;
            String string = bufferedReader.readLine();

            try {
                productCost = Double.parseDouble(string);
                if (productCost < 0) {
                    System.out.println("Введите положительное число.");
                    isNumber = false;
                }
            } catch (Exception exception) {
                isNumber = false;

                System.out.println("Введено недопустимое значение.\nПожалуйста, введите число.");
            }
        }
        while (!isNumber);
        productSum = productSum + productCost;
    }
}
