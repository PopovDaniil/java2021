import java.util.Scanner;

public class Pract4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 2*i + 1;
        }
        
        System.out.println("10 нечётных чисел:");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();

        //2
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        System.out.println("Введите элементы массива:");
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + ": ");
            arr2[i] = in.nextInt();
        }

        int min = arr2[0];
        for (int i : arr2) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальные элементы:");
        for (int i : arr2) {
            if (i == min) {
                System.out.print(i + " ");
            }
        }

        //3
        int max = arr2[0];
        for (int i : arr2) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("\nМаксимальные элементы:");
        for (int i : arr2) {
            if (i == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //4
        int imin = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (min == arr2[i]) {
                imin = i;
                break;
            }
        }

        int imax = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (max == arr2[i]) {
                imax = i;
                break;
            }
        }

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int t = arr2[imin];
        arr2[imin] = arr2[imax];
        arr2[imax] = t;

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //5

        int sum = 0;
        for (int i : arr2) {
            sum += i;
        }
        float avg = (float) sum / arr2.length;
        System.out.println("Среднее арифметическое: " +  avg);

        in.close();
    }
}
