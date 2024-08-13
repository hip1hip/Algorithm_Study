import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int scores[] = new int[n];
        // int max = scores[0]; // 최대값
        // int min = scores[0]; // 최소값

        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }
        // for (int i = 0; i < scores.length; i++) {
        // sum += scores[i];

        // }
        Arrays.sort(scores);

        // max = scores[0]; // 최대값
        // min = scores[0]; // 최소값
        System.out.println(scores[0] + " " + scores[scores.length - 1]);
    }
}

// //최대값 최소값을 구할 int배열
// int array[] = {4,3,2,1,10,8,7,6,9,5};
// int max = array[0]; //최대값
// int min = array[0]; //최소값

// Arrays.sort(array); // 배열 정렬

// // 최소값(Min) 출력
// System.out.println("최소값은 : "+array[0]);

// // 최대값(Max) 출력
// System.out.println("최대값은 : " +array[array.length - 1]);