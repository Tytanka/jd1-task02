package by.htp.dekomp.main;

/*
 * 16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию. 
 */

public class Task16 {

	public static void main(String[] args) {
		int n;
		int n2;
		int twins;

		n = 100;
		n2 = 2 * n;
		twins = 0;

		System.out.print("Числа-близнецы: ");
		for (int i = n; i <= n2; i++) {
			if (getPrime(i - 1) && getPrime(i + 1)) {
				if ((i - 1) > n || (i + 1) < n2) {
					twins++;
					System.out.print((i - 1) + " " + (i + 1) + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Кол-во пар чисел-близнецов на отрезке [" + n + "; " + n2 + "] :" + twins);
	}

	public static boolean getPrime(int n) {
		int num = 0;
		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i ==  Math.sqrt(n))
					num++;
				else
					num += 2;
			}
		}
		if (num == 2)
			return true;
		else
			return false;
	}

}
