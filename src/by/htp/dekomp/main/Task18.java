package by.htp.dekomp.main;
/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. 
  */

public class Task18 {

	public static void main(String[] args) {

		int n;
		n = 3;
		getDig(n);

	}

	public static void getDig(int n) {

		int a;
		int b;
		int k;
		int dig;

		a = 0;
		b = 0;
		k = 1;

		for (int i = 0; i < n; i++) {
			a += (n - i) * k;
			b += (9 - i) * k;
			k *= 10;

		}
		for (dig = a; dig <= b; dig++) {

			int d;
			int j;
			k = dig;
			d = k % 10;
			for (j = 1; j < n; j++) {
				k /= 10;
				if (k % 10 >= d)
					break;
				d = k % 10;
			}
			if (j == n) {

				System.out.println(dig);
			}
		}

	}

}
