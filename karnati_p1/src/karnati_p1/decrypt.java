package karnati_p1;

import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		
		int digits;
		int first_digit;
		int second_digit;
		int third_digit;
		int fourth_digit;
		int new_num;
		int temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a 4 digit number to decrypt");
		digits = in.nextInt();
		
		fourth_digit = digits % 10;
		third_digit = ((digits%100) - fourth_digit)/10;
		second_digit = ((digits%1000) - (third_digit*10))/100;
		first_digit = (digits - (second_digit*100))/1000;
		
		if (fourth_digit == 8 || fourth_digit == 9) {
			fourth_digit -= 7;
		}
		else {
			fourth_digit += 3;
		}
		
		if (third_digit == 8 || third_digit == 9) {
			third_digit -= 7;
		}
		else {
			third_digit += 3;
		}
		
		if (second_digit == 8 || second_digit == 9) {
			second_digit -= 7;
		}
		else {
			second_digit += 3;
		}
		if (first_digit == 8 || first_digit == 9) {
			first_digit -= 7;
		}
		else {
			first_digit += 3;
		}
		
		temp = fourth_digit;
		fourth_digit = second_digit;
		second_digit = temp;
		
		temp = first_digit;
		first_digit = third_digit;
		third_digit = temp;
		
		new_num = (first_digit * 1000) + (second_digit*100) + (third_digit * 10) + fourth_digit;
		
		System.out.println(new_num);
	}

}
