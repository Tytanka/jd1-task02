package by.htp.dekomp.main;

/*
 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 *  элементами которого являются числа, сумма цифр которых равна К и которые не большее N. 
 */

public class Task15 {

	public static void main(String[] args) {

		int k;
		int n;

		n = 100;
		k = 24;
		int sum;

		int mas[] = new int[n];
		initMas(mas);
		printMas(mas);
		sum = getSum(k);

		System.out.println("сумма цифр " + sum);

		for (int i = 0; i < mas.length; i++) {
			int j = getSum(i);
			if (j == sum) {
				System.out.print(mas[i] + " ");
			}
		}
	}

	public static int getSum(int k) {
		int s;
		s = 0;
		while (k != 0) {

			s = s + k % 10;
			k = k / 10;
		}
		return s;
	}

	public static void initMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}

}
