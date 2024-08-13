package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	//배열 a 의 최댓값을 나타냅니다.(값을 난수로 생성)
	//최댓값을 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i=1; i < a.length; i++)
			if( a[i] > max) 
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random(); 
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();  //배열의 요소수 입력
		
		int[] height = new int[num];  // 요소수 num의 배열 생성 
		
		System.out.println("키 값은 아래와 같습니다.");
		for ( int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); // 난수 
			System.out.println("height[" + i + "] : " + height[i] );
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다. ");
		
		
	}

}
