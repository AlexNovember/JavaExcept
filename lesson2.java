import java.util.Scanner;
import java.io.FileNotFoundException;

public class lesson2 {
    public static void main(String[] args) {

        /* 1. Реализуйте метод, который запрашивает у 
        пользователя ввод дробного числа 
        (типа float), и возвращает введенное 
        значение. Ввод текста вместо числа не 
        должно приводить к падению приложения, 
        вместо этого, необходимо повторно 
        запросить у пользователя ввод данных.*/

    //     try (Scanner scanner = new Scanner(System.in)) {
    //         boolean valid;
    //         Float myNumber = null;
    //         String inputData;
    //         do {
    //             System.out.print("Введите число:\t");
    //             try {
    //                 inputData = scanner.nextLine();
    //                 if (Float.parseFloat(inputData) > 0) {
    //                     myNumber = Float.parseFloat(inputData);
    //                     valid = true;
    //                 } else {
    //                     valid = false;
    //                 }
    //             } catch (Exception ex) {
    //                 System.out.println("Ввели не число, попробуйте еще раз");
    //                 valid = false;
    //             }
    //         } while (!valid);
    //         System.out.println("Вы ввели: " + myNumber);
    //     }
    // }
    
    // 2. Если необходимо, исправьте данный код

    // try {
    //     int d = 0;
    //     int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //переменная intArray не была объявлена и инициализирована
    //     double catchedRes1 = intArray[8] / d;
    //     System.out.println("catchedRes1 = " + catchedRes1);
    // } catch (ArithmeticException e) {
    //     System.out.println("Catching exception: " + e);
    // }
    // }

//     try {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] abc = {1, 2};
//         abc[3] = 9;
//     } catch (NullPointerException ex) {
//         System.out.println("Указатель не может указывать на null!");
//     } catch (IndexOutOfBoundsException ex) {
//         System.out.println("Массив выходит за пределы своего размера!");
//     } catch (Throwable ex) {
//         System.out.println("Что-то пошло не так...");
//     }
// }

// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
// }


/* 4.Разработайте программу, которая выбросит Exception, 
когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, 
что пустые строки вводить нельзя. 
Далее запросить повторный ввод строки */

try (Scanner scanner = new Scanner(System.in)) {
    boolean valid = false;
    String inputData = null;
    while (!valid) {
        System.out.print("Введите текст: \t");
        try {
            inputData = scanner.nextLine();
            if (inputData.length() > 0) {
                valid = true;
            } else {
                System.out.println("Пустые строки вводить нельзя!");
                valid = false;
            }
        } catch (Exception ex) {
            valid = false;
        }
    }
    System.out.println("Вы ввели: " + inputData);
}
    }

}


