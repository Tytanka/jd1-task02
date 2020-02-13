package by.htp.dekomp.main;

//3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.  

public class Task03 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int e;

		a = 8;
		b = 16;
		c = 32;
		e = 64;

		int nod = getNod4(a, b, c, e);

		System.out.println("наибольший общий делитель = " + nod);

	}

	public static int getNod(int x, int y) {

		int d;
		d = 0;
		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
			d = x;
		}

		return d;
	}

	public static int getNod4(int a, int b, int c, int d) {
		int x;
		int y;
		int z;

		x = getNod(a, b);
		y = getNod(c, d);

		z = getNod(x, y);

		return z;
	}
}
