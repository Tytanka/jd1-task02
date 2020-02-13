package by.htp.dekomp.main;

//4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. 

public class Task04 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 9;
		b = 18;
		c = 45;

		int nok = getNok(getNok(a, b), c);

		System.out.println("наименьшее общее кратное = " + nok);

	}

	public static int getNok(int x, int y) {

		int z;
		int kr;
		kr = 0;

		z = x * y;
		while (x != 0 && y != 0) {
			if (x > y) {
				x = x % y;
			} else {
				y = y % x;
			}

			kr = z / (x + y);
		}

		return kr;

	}
}
