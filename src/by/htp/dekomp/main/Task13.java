package by.htp.dekomp.main;

/*
 *13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N. 
 */

public class Task13 {

	public static void main(String[] args) {

		int n;

		n = 128;

		int count;
		count = getDig(n);
		System.out.println("цифр в массиве  " + count);
		int mas[] = new int[count];
		initMas(n, mas);
		printMas(mas);

	}

	public static int getDig(int n) {

		int count;
		count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static void initMas(int n, int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			int d;
			d = 0;
			if (n > 0) {
				d = n % 10;
				mas[i] = d;
				n = n / 10;

			}
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}
}
