package by.htp.dekomp.main;

//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 

public class Task14 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 358;
		b = 702;

		getMaxNumb(a, b);

	}

	public static void getMaxNumb(int x, int y) {

		while (x > 0 && y > 0) {

			x = x / 10;
			y = y / 10;
			if (x == 0 && y == 0) {
				System.out.println("14) В двух числах одинаковое количество цифр");
				break;
			}
			if (y == 0) {
				System.out.println("14) В первом числе больше цифр");
			}

			if (x == 0) {
				System.out.println("14) Во втором числе больше цифр");
			}

		}

	}

}