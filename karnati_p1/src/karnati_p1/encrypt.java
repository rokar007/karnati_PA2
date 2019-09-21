package karnati_p1;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		
		int digits;
		int first_digit;
		int second_digit;
		int third_digit;
		int fourth_digit;
		int new_num;
		int temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a 4 digit number to encypt");
		digits = in.nextInt();
		
		
		
		fourth_digit = digits % 10;
		third_digit = ((digits%100) - fourth_digit)/10;
		second_digit = ((digits%1000) - (third_digit*10))/100;
		first_digit = (digits - (second_digit*100))/1000;
		
		fourth_digit = (fourth_digit + 7)%10;
		third_digit = (third_digit + 7) %10;
		second_digit = (second_digit + 7)%10;
		fourth_digit = (fourth_digit + 7)%10;
		
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
