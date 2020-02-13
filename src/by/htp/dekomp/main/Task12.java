package by.htp.dekomp.main;

/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 *  Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой. 
 */

public class Task12 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		x = 3;
		y = 4;
		z = 13;
		t = 12;
		double sq;
		sq = getSquare(x, y, z, t);
		System.out.println("12) Площадь четырехугольника равна " + sq);
	}

	public static double getSquare(double a, double b, double c, double d) {
		double diag;
		double s1;
		double s2;
		double square;

		diag = Math.sqrt(a * a + b * b);
		s1 = a * b * 0.5;
		s2 = 0.25 * Math.sqrt((diag + c + d) * (diag + c - d) * (diag + d - c) * (c + d - diag));
		square = s1 + s2;
		return square;

	}

}
