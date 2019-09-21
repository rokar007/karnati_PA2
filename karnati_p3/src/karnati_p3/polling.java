package karnati_p3;

import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		
		int[][] responses = new int[5][11];
		int k;
		int j;

		
		for(int i=1;i<=10;i++){  
			
			Scanner in = new Scanner(System.in);
			System.out.println("please rate the campaign from 1 to 10");
			k = in.nextInt();
			responses[1][k] += 1;
			System.out.println("please rate the multiplayer from 1 to 10");
			k = in.nextInt();
			responses[1][k] += 1;
			System.out.println("please rate the custom games from 1 to 10");
			k = in.nextInt();
			responses[1][k] += 1;
			System.out.println("please rate the character design from 1 to 10");
			k = in.nextInt();
			responses[1][k] += 1;
			System.out.println("please rate the overall game from 1 to 10");
			k = in.nextInt();
			responses[1][k] += 1;
			
			System.out.println("if everyone has taken the survey please enter 1");
			j = in.nextInt();
			if (j==0) {
				break;
			}
		}
		
		
		
		for(int l=1;l<=5;l++){  
			
			for(int m=1;m<=10;m++){  
				responses[l][11] += responses[l][m];
			}
			responses[l][11] /= 10;
		}
		
		System.out.println("                 1 2 3 4 5 6 7 8 9 10 avg");
		System.out.println("   campaign " + responses[1][1] + " " + responses[1][2] + " "+ responses[1][3] + " "+ responses[1][4] + " "+ responses[1][5] + " "+ responses[1][6] + " "+ responses[1][7] + " "+ responses[1][8] + " "+ responses[1][9] + " "+ responses[1][10] + " "+ responses[1][11] );
		System.out.println("  multiplayer "+ responses[2][1] + " " + responses[2][2] + " "+ responses[2][3] + " "+ responses[2][4] + " "+ responses[2][5] + " "+ responses[2][6] + " "+ responses[2][7] + " "+ responses[2][8] + " "+ responses[2][9] + " "+ responses[2][10] + " "+ responses[2][11] );
		System.out.println("  custom games "+ responses[3][1] + " " + responses[3][2] + " "+ responses[3][3] + " "+ responses[3][4] + " "+ responses[3][5] + " "+ responses[3][6] + " "+ responses[3][7] + " "+ responses[3][8] + " "+ responses[3][9] + " "+ responses[3][10] + " "+ responses[3][11] );
		System.out.println("character design "+ responses[4][1] + " " + responses[4][2] + " "+ responses[4][3] + " "+ responses[4][4] + " "+ responses[4][5] + " "+ responses[4][6] + " "+ responses[4][7] + " "+ responses[4][8] + " "+ responses[4][9] + " "+ responses[4][10] + " "+ responses[4][11] );
		System.out.println("    overall "+ responses[5][1] + " " + responses[5][2] + " "+ responses[5][3] + " "+ responses[5][4] + " "+ responses[5][5] + " "+ responses[5][6] + " "+ responses[5][7] + " "+ responses[5][8] + " "+ responses[5][9] + " "+ responses[5][10] + " "+ responses[5][11] );
		
	}
		
		
}
