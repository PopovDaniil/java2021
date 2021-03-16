package Pract7;

import java.util.Scanner;

public class Task3 {
    public static int[] arr;
    public static Scanner in = new Scanner(System.in);

    public static void input(int pos) {
        if (pos < arr.length) {
            System.out.println(pos+1 +" число");
            int n = in.nextInt();
            arr[pos] = n;
            input(++pos);
        }
    }
    public static void output(int pos) {
        if (pos < arr.length) {
            System.out.println(pos+1 +" число: " + arr[pos]);
            output(++pos);
        }
    }

    public static void main(String[] args) {
        arr = new int[5];
        input(0);
        output(0);
    }
}
