import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class Pract8_2_ira {
	public static byte[] get() throws IOException {
		byte[] mas;
		Scanner in = new Scanner(System.in);

		System.out.println("Введите размер массива: ");
		int s = in.nextInt();
		mas = new byte[s];

		for (int i = 0; i < mas.length; i++) {
			if (!in.hasNextByte()) {
				throw new IOException();
			}
			mas[i] = in.nextByte();
		}
		return mas;
	}

	public static int sum(byte[] arr) {
		byte sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		byte[] mas;

		try {
			mas = get();
			System.out.println("Сумма чисел: " + sum(mas));
		} catch (InputMismatchException e) {
			System.out.println("Ошибка: Введена строка");
		} catch (IOException e) {
			System.out.println("Ошибка: Значение не byte");
		} 
	}
}
