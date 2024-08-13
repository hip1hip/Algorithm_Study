import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int scores[] = new int[9];

        int max = 0;
        int t = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                t = i;
            }
        }

        System.out.println(max + " ");

        System.out.println(t + 1);

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