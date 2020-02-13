package by.htp.dekomp.main;

//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.  

public class Task06 {

	public static void main(String[] args) {

		double a;
		double plosch;
		
		a = 5;

		plosch = 6 * getStr(a);

		System.out.println("Площадь правильного шестиугольника со стороной = " + a + " равна " + plosch);

	}

	public static double getStr(double x) {

		double s;

		s = (x * x * Math.sqrt(3)) / 4;

		return s;
	}

}
