package by.htp.dekomp.main;

//9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. 

public class Task09 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 6;
		b = 8;
		c = 9;

		int nod = getNod3(a, b, c);
		if (nod == 1) {
			System.out.println("09) Числа " + a + " " + b + " " + c + "  являются взаимно простыми");
		} else {
			System.out.println("09) Числа " + a + " " + b + " " + c + " не являются взаимно простыми");
		}
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

	public static int getNod3(int a, int b, int c) {
		int x;
		int z;

		x = getNod(a, b);
		z = getNod(x, c);

		return z;

	}
}
