package by.htp.dekomp.main;

/*
 * 8. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 *  которое меньше максимального элемента массива, но больше всех других элементов). 
 */

public class Task08 {

	public static void main(String[] args) {

		int mas[] = new int[10];

		System.out.print(" В массиве чисел ");

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10 + 1);

			System.out.print(" " + mas[i]);
		}

		int max2 = getMax(mas);
		System.out.println(" второе по величине число: " + max2);

	}

	public static int getMax(int mas[]) {

		int m = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (m < mas[i]) {
				m = mas[i];

			}
		}

		int mas2[] = new int[10];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < m) {

				mas2[i] = mas[i];
			}
		}
		int m2 = mas2[0];
		for (int j = 0; j < mas2.length; j++) {

			if (m2 < mas2[j]) {
				m2 = mas2[j];

			}
		}

		return m2;
	}

}
