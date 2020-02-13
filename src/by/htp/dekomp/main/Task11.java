package by.htp.dekomp.main;

/*
 * 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 *  Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m. 
 */

public class Task11 {

	public static void main(String[] args) {

		int d[] = new int[10];
		initMas(d);
		printMas(d);
		getSum(d);

	}

	public static void initMas(int[] d) {
		for (int i = 0; i < d.length; i++) {
			d[i] = (int) (Math.random() * 10 + 1);
		}
	}

	public static void printMas(int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.print(" " + d[i]);
		}
		System.out.println();
	}

	public static void getSum(int[] d) {
		int sum;
		for (int i = 0; i < d.length - 2; i++) {
			sum = d[i] + d[i + 1] + d[i + 2];
		System.out.print(sum + " ");
		}
	}

}
