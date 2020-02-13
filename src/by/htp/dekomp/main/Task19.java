package by.htp.dekomp.main;

/*
 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 
 */

public class Task19 {

	public static void main(String[] args) {

		int n;

		n = 2;

		int sum = getSumOddDig(n);
		System.out.println("Сумма чисел равна " + sum);
		int count = getCountDig(n);
		System.out.println("Четных цифр в данной сумме " + count);

	}

	public static int getSumOddDig(int n) {
		int k;
		k = 1;

		for (int i = 1; i <= n; i++) {
			k = k * 10;
		}

		int s;
		s = 0;
		int m;
		m = k / 10;
		for (int i = m; i < k; i++) {

			int j = i;
			boolean b;
			b = true;
			while (j > 0 && b) {
				if (j % 2 == 0) {

					b = false;
				} else {

					j = j / 10;

				}
			}
			if (b) {
				s = s + i;
			}
		}
		return s;
	}

	public static int getCountDig(int n) {
		int count;
		count = 0;
		int s = getSumOddDig(n);
		while (s > 0) {
			if ((s % 10) % 2 == 0) {
				count = count + 1;
			}
			s = s / 10;
		}
		return count;
	}
}
