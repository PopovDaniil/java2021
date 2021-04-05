import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] arr;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        int n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0, kol = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                sum += i;
                kol++;
            }
        }
        float avg = (float) sum / kol;

        System.out.println("Сумма чисел, делящихся на 3: " + sum);
        System.out.println("Количество чисел, делящихся на 3: " + kol);
        System.out.println("Среднее арифметическое чисел, делящихся на 3: "+ avg);

        int imin = 0, imax = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3 == 0) && (arr[i] > 0)) {
                if (arr[i] < arr[imin]) {
                    imin = i;
                }
                if (arr[i] > arr[imax]) {
                    imax = i;
                }
            }
        }

        System.out.println("Минимальное, делящееся на 3: arr["+imin+"]="+arr[imin]);
        System.out.println("Максимальное, делящееся на 3: arr["+imax+"]="+arr[imax]);

        int t = arr[imin];
        arr[imin] = arr[imax];
        arr[imax] = t;

        for (int i : arr) {
            System.out.println(i);
        }
        in.close();
    }
}
