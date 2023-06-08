import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {

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
    
    try {
        int d = 0;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
    }
}


