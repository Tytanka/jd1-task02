package by.htp.dekomp.main;

//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.  

public class Task05 {

	public static void main(String[] args) {

		int a = 5;
		int b = 8;
		int c = 6;

		int sum;
		sum=getSumMaxMin(a,b,c);
		System.out.println("Сумма большего и меньшего из трех чисел равна " + sum);
	}

	public static int getSumMaxMin(int x1, int x2, int x3) {
		int max;
		int min;

		max = x1;

		if (max < x2) {
			max = x2;
		}

		if(max<x3) {
			max=x3;
		}
	
		
		min=x1;
		
		if(min>x2) {
			min = x2;
		}
		
		if (min>x3) {
			min=x3;
		}
		
			return max+min;

	}

}
