package by.htp.dekomp.main;

/*
 * 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 *   возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
 *   Для решения задачи использовать декомпозицию. 
 */

public class Task17 {

	public static void main(String[] args) {

		int n;
		int sum;

		n = 407;

		for (int i = 1; i <= n; i++) {
			sum = getSum(i);

			if (i == sum) {
				System.out.println(i + " является числом Армстронга");
			} else {
				continue;

			}
		}

	}

	public static int getSum(int n) {
		int sum;
		int countdig;
		int ostat;
		int dig;

		sum = 0;
		dig = 0;
		countdig = n;

		while (countdig != 0) {
			dig++;
			countdig = countdig / 10;
		}

		countdig = n;

		while (countdig != 0) {
			ostat = countdig % 10;
			sum = sum + power(ostat, dig);
			countdig = countdig / 10;
		}
		return sum;
	}

	public static int power(int a, int b) {

		int res;
		res = 1;

		for (int i = 1; i <= b; i++) {
			res = res * a;
		}

		return res;
	}

}
