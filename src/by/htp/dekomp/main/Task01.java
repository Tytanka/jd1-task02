package by.htp.dekomp.main;

/*
 *  1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. 
*/
public class Task01 {
	public static void main(String[] args) {

		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double s;

		x1 = 1.0;
		y1 = 1.0;

		x2 = 4.0;
		y2 = 4.0;

		x3 = 5.0;
		y3 = 1.0;

		s = getSquare(x1, x2, x3, y1, y2, y3);
		System.out.println("Площадь треугольника равна " + s);
	}

	public static double getSideA(double x1, double x2, double y1, double y2) {

		double a;

		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		return a;
	}

	public static double getSideB(double x1, double x3, double y1, double y3) {

		double b;

		b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		return b;
	}

	public static double getSideC(double x2, double x3, double y2, double y3) {

		double c;

		c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

		return c;
	}

	public static double getPp(double x1, double x2, double x3, double y1, double y2, double y3) {
		double a;
		double b;
		double c;
		double p;
		double pp;

		a = getSideA(x1, x2, y1, y2);
		b = getSideB(x1, x3, y1, y3);
		c = getSideC(x2, x3, y2, y3);

		p = a + b + c;

		pp = p / 2;

		return pp;

	}

	public static double getSquare(double x1, double x2, double x3, double y1, double y2, double y3) {

		double s;
		double pp;

		double a = getSideA(x1, x2, y1, y2);
		double b = getSideB(x1, x3, y1, y3);
		double c = getSideC(x2, x3, y2, y3);

		pp = getPp(x1, x2, x3, y1, y2, y3);
		s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

		return s;

	}

}