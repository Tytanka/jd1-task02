package by.htp.dekomp.main;

//2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: 

public class Task02 {

	public static void main(String[] args) {

		int a;
		int b;
		int nod;
		int nok;

		a = 9;
		b = 12;

		nod = getNod(a, b);
		nok = getNok(a, b);

		System.out.println("наибольший общий делитель = " + nod + " наименьшее общее кратное = " + nok);
	}

	public static int getNod(int x, int y) {

		int d;
		d = 0;
		while (x != 0 && y != 0) {
			if (x > y) {
				x %= y;
			} else {
				y %= x;
			}
			d = x + y;
		}

		return d;
	}

	public static int getNok(int x, int y) {

		int k;
		int d;

		d = getNod(x, y);

		k = (x * y) / d;

		return k;

	}

}
