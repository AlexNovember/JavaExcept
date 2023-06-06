import java.util.Arrays;

public class lesson1 {
    public static void main(String[] args) {
    //     System.out.println(divide(10, 0));
    // }
    
// 1
    // public static int divide(int a, int b) {
    //     if (b == 0) {
    //         return -1;
    //     }
    //     return a / b;
    // }

// 2
    // public static int divide(int a, int b) {
    //     if (b == 0) {
    //         throw new RuntimeException("You can't divide by zero!");
    //     }
    //     return a / b;
    // }
// 3
//     public static int divide(int a, int b) {
//         return a / b;
//     }
// }


//     }
// public static int sum2d(String[][] arr){
//     int sum = 0;
//     try {
//       for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < 5; j++) {
//           int val = Integer.parseInt(arr[i][j]);
//           sum += val;
//         }
//       }
//     } catch (NumberFormatException e) {
//       System.out.println("Invalid value found."); // если строка, которую пытаемся преобразовать в число, не является допустимым числом
//     } catch (NullPointerException e) {
//       System.out.println("Null value found."); //если в массиве встречается значение null вместо строки
//     } catch (IndexOutOfBoundsException e) {
//       System.out.println("Invalid index of the array."); //если в массиве пытаемся получить значение по индексу, которого не существует
//     }
//     return sum;
//   }
// }

int[] array1 = {1, 2, 3, 4};
int[] array2 = {5, 1, 0, 1, 1};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Different length of arrays");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("You can't divide by zero!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}