package by.htp.dekomp.main;

/*
 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
 *  между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 */

public class Task07 {

	public static void main(String[] args) {

		int x[] = new int[10];
		int y[] = new int[10];

		initMasX(x);
		initMasY(y);
		printMasX(x);
		printMasY(y);
		getDist(x, y);
	}

	public static void initMasX(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 10 + 1);

		}
	}

	public static void initMasY(int[] y) {
		System.out.println();
		for (int j = 0; j < y.length; j++) {
			y[j] = (int) (Math.random() * 10 + 1);
		}
	}

	public static void printMasX(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("x " + x[i] + "  ");
		}
		System.out.println();
	}

	public static void printMasY(int[] y) {
		for (int j = 0; j < y.length; j++) {
			System.out.print("y " + y[j] + "  ");
		}
		System.out.println();
	}

	public static void getDist(int x[], int[] y) {
		double d;
		double d1;
		d = 0;
		d1 = 0;
		for (int i = 1; i < x.length; i++) {
			for (int j = 1; j < y.length; j++) {

				d1 = Math.sqrt(Math.pow(x[i] - x[i - 1], 2) + Math.pow(y[j] - y[j - 1], 2));

			}
			System.out.println("Расстояние между двумя точками с заданными координатами равно: " + d1);
			if (d1 > d) {
				d = d1;
			}
		}
		System.out.println("Максимальное расстояние между двумя точками с заданными координатами равно: " + d);
	}

}
