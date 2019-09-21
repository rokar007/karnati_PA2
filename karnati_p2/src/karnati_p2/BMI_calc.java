package karnati_p2;

import java.util.Scanner;

public class BMI_calc {
	
	public static void main(String[] args) {
		
		int option;
		double weight;
		double height;
		double bmi = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("if you would like to enter you weight in Pounds and height in Inches please enter 1 ");
		System.out.println("if you would like to enter you weight in Kilograms and height in Meters please enter 2 ");
		
		option = in.nextInt();
		
		if (option == 1) {
			
			Scanner pounds = new Scanner(System.in);
			System.out.println("please enter your weight in pounds");
			weight = pounds.nextDouble();
			Scanner inches = new Scanner(System.in);
			System.out.println("please enter your height in inches");
			height = inches.nextDouble();
			
			bmi = (703 * weight)/(height * height);
		}
		else if (option == 2) {
			
			Scanner kilos = new Scanner(System.in);
			System.out.println("please enter your weight in kilograms");
			weight = kilos.nextDouble();
			Scanner meters = new Scanner(System.in);
			System.out.println("please enter your height in meters");
			height = meters.nextDouble();
			
			bmi = weight/(height * height);
			
		}
	
		if(bmi < 18.5) {
			
			System.out.println("your bmi is" + bmi + "and you are underweight");
		}
		else if(18.5 <= bmi  && bmi <= 24.9) {
			
			System.out.println("your bmi is" + bmi + "and you are normal weight");
		}
		else if(25 <= bmi  && bmi <= 29.9) {
			
			System.out.println("your bmi is" + bmi + "and you are overweight");
		}
		else if(bmi >= 30) {
			
			System.out.println("your bmi is " + bmi + " and you are obese");
		}
		
	}

}
