package Pract7;

public class Task2 {

    public static String bin = "";

    public static void toBin(int i) {
        int o = i % 2;
        bin += o;
        if (i > 1) {
            toBin(i / 2);
        }
    }

    public static int getBin(int i) {
        toBin(i);
        String rev = new StringBuilder(bin).reverse().toString();
        return Integer.parseInt(rev);
    }

    public static void main(String[] args) {
        System.out.println(getBin(55));
    }
}
