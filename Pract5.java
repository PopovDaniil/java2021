import java.util.Arrays;
import java.util.Collections;

public class Pract5 {
    public static void main(String[] args) {
        
        // 1
        System.out.println("Исходный массив:");
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Сортировка по убыванию:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // 2
        String[] brands = new String[] { "Mercedes", "MAN", "Scania", "Volvo" };
        
        System.out.println("Сортировка по возрастанию:");
        Arrays.sort(brands);
        for (String i : brands) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Сортировка по убыванию:");
        Arrays.sort(brands,Collections.reverseOrder());
        for (String i : brands) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
