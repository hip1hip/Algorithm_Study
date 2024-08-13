package chap01;

import java.util.Scanner;

public class Q15 {
	static void triangleLB(int n) {
		for(int i= 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i= n; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i= 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int c= n; c >= i; c--) {
				System.out.print("*");
			}
			System.out.println();
			
		
		}
			
	}
	
//    for (int i = 1; i <= n; i++) {
//
//        for (int j = n; j > i; j--) {
//            System.out.print(" ");
//        }
//
//        for (int x = 1; x <= i; x++) {
//            System.out.print("*");
//        }
	
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("단수는 ：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n); // 왼쪽 아래가 직각인 이등변삼각형
		
		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형
		
		
		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n); // 오른쪽 위가 직각인 이등변삼각형

		
        int t = stdIn.nextInt();

        for (int i = 1; i <= t; i++) {

            for (int j = t; j > i; j--) {
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
		
	}
	
		
		
		



