import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class Pract8 {
	public static void main(String[] args) {
		byte[] arr;
		int max_i = 0;
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Введите размер массива: ");
			int size = in.nextInt();
			arr = new byte[size];

			for (int i = 0; i < size; i++) {
				System.out.print("arr[" + i + "]=");
				if (!in.hasNextByte()) {
					throw new IOException();
				}
				arr[i] = in.nextByte();
			}

			boolean hasPositive = false;
			for (int i = 0; i < size; i++) {
				if (arr[i] > 0) {
					hasPositive = true;
					if (arr[i] > arr[max_i]) {
						max_i = i;
					}
				}
			}

			if (!hasPositive) {
				throw new IllegalArgumentException();
			}

			System.out.println("Индекс максимума: " + max_i);
		} catch (InputMismatchException e) {
			System.out.println("Ошибка: Введена строка вместо числа");
		} catch (IOException e) {
			System.out.println("Ошибка: Значение не входит в диапазон типа byte");
		} catch (IllegalArgumentException e) {
			System.out.println("Ошибка: Все значения в массиве отрицательные, либо он пустой");
		} catch (NegativeArraySizeException e) {
			System.out.println("Ошибка: Размер массива отрицательный");
		} finally {
			in.close();
		}
	}
}
