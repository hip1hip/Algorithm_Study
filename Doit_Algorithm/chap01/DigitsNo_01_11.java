package chap01;

import java.util.Scanner;

public class DigitsNo_01_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int n;
		
		do {
			System.out.print("정숫값 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		int no = 0;
		
		while (n > 0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 " + no + "자리입니다.");
		

	
		
		
		
		
		
		
		
	}

}
