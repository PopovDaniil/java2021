import java.util.Arrays;

public class Pract6 {
    public static void main(String[] args) {

        // 1
        System.out.println("====Задание 1=====");
        int[][] arr;
        arr = new int[5][6];
        System.out.println("Массив случайных чисел: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Элементы третьей строки: ");
        for (int j = 0; j < 6; j++)
            System.out.print(arr[2][j] + "\t");
        System.out.println();
        System.out.println();

        // 2
        System.out.println("====Задание 2=====");
        int[][] matrixC;
        matrixC = new int[3][3];
        int[][] matrixD;
        matrixD = new int[3][3];
        System.out.println("Матрица С:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = (int) (Math.random() * 100);
                matrixD[i][j] = (int) (Math.random() * 100);
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Матрица D:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixD[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] matrixAdd = new int[3][3];
        int[][] matrixMul = new int[3][3];
        System.out.println("Результат сложения:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrixMul[i][j] += matrixC[i][k] * matrixD[k][j];
                }
                matrixAdd[i][j] = matrixC[i][j] + matrixD[i][j];
                System.out.print(matrixAdd[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Результат умножения:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixMul[i][j] + "\t");
            }
            System.out.println();
        }

        // 3
        System.out.println("====Задание 3=====");
        int[][] arr2;
        arr2 = new int[5][5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = (int) (Math.random() * 100);
                sum += arr2[i][j];
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Сумма всех элементов = " + sum);
        System.out.println();

        // 4
        System.out.println("====Задание 4=====");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Индексы отрицательных элементов:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] < 0) {
                    System.out.format("[%d][%d]\n", i, j);
                }
            }
        }

        // 5
        matrix = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Сортировка строк по возрастанию: ");
        Arrays.asList(matrix).forEach(Arrays::sort);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
