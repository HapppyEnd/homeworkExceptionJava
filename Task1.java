import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного 
 * числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

class Task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while (flag) {
            try {
                System.out.println("Введите дробное число: ");
                float number = Float.parseFloat(reader.readLine());
                System.out.println(number);
                flag = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Попробуйте снова");
            }
        }
    }
}
