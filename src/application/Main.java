package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AreaTriangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AreaTriangulo x, y;

		x = new AreaTriangulo();
		y = new AreaTriangulo();

		System.out.println("Enter the measure of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measure of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triagle X area: %.4f%n", areaX);
		System.out.printf("Triagle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else { System.out.println("Larger area: Y");

		}

		sc.close();

	}

}
