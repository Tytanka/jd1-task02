package by.htp.dekomp.main;

//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 

public class Task10 {

	public static void main(String[] args) {

		int fact;
		fact = 0;
		fact = getFact();
		System.out.println("10) Cуммы факториалов всех нечетных чисел от 1 до 9 равна " + fact);

	}

	public static int getFact() {
		int fact;
		int result;
		result = 1;
		fact = 0;
		for (int i = 1; i <= 9; i++) {
			result *= i;
			if (i % 2 != 0) {
				fact += result;
			}
		}
		return fact;
	}

}
