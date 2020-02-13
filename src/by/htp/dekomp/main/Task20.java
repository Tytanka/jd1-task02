package by.htp.dekomp.main;

/*
 * 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 
 */

public class Task20 {

	public static void main(String[] args) {

		int n;
		int count;

		n = 125;

		count = getCount(n);
		System.out.println("Необходимо произвести " + count + " действий");
	}

	public static int getSum(int n) {
		int sum;
		sum = 0;
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}

	public static int getCount(int n) {
		int s;
		int k;
		k = 0;
		s = getSum(n);
		while (n > 0) {
			n = n - s;
			k++;
		}
		return k;
	}

}
