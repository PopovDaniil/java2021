import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class Pract8_ira {
	public static void main(String[] args) {
		byte[] arr;
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Введите размер массива: ");
			int s = in.nextInt();
			arr = new byte[s];

			for (int i = 0; i < s; i++) {
				if (!in.hasNextByte()) {
					throw new IOException();
				}
				arr[i] = in.nextByte();
			}

			byte sum = 0;
			for (int i = 0; i < s; i++) {
				sum += arr[i];
			}

			System.out.println("Сумма чисел: " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Ошибка: Введена строка вместо числа");
		} catch (IOException e) {
			System.out.println("Ошибка: Значение не byte");
		}
	}
}
