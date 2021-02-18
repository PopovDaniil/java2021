import java.util.Scanner;

public class Pract3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //For
        //1
        System.out.println("Нечётные числа от 1 до 99:");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
            }
        }

        //2
        System.out.print("\nn = ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("n! = " + fact);

        //While
        //3.1
        System.out.println("Нечётные числа от 1 до 99:");
        int i = 1;
        while (i <= 99) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
            }
            i++;
        }

        //3.2
        System.out.print("\nn = ");
        n = in.nextInt();
        fact = 1;
        i = 2;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("n! = " + fact);

        //4
        System.out.print("\nx = ");
        int x = in.nextInt();
        System.out.print("n = ");
        n = in.nextInt();
        
        int p = 1;
        for (int j = 0; j < n; j++) {
            p *= x;
        }
        System.out.println("x^n = " + p);

        //5
        for (int j = 0; j < 10; j++) {
            System.out.print(j * (-5) + " ");
        }
        System.out.println();

        //6
        String searchMe = "Мама мыла раму";
        int max = searchMe.length();
        char symb = 'а';
        boolean find = false;
        for (int j = 0; j < max; j++) {
            if (searchMe.charAt(j) == symb) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Символ '" + symb + "' найден в строке");
        } else {
            System.out.println("Символ '" + symb + "' не найден в строке");
        }

        in.close();
    }
}
