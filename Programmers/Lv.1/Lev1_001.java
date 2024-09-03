//https://school.programmers.co.kr/learn/courses/30/lessons/86491
//최소직사각형

import java.util.Arrays;

public class Lev1_001 {
    public int solution(int[][] sizes) {
        int answer = 0;

        //최솟값으로 최기화  - 이후 비교를 위해 제일 작은값으로 초기화
        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        // 각 1차원 배열의 요소들을 순서를 바꿈
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]); // 정렬하여 순서를 바꿈 (오름차순)
            //{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}  정렬
            //[7,10]  [3, 12] [8, 15 ] .....
            // 최소값들 중 최대값을 찾기
            maxFirst = Math.max(maxFirst, sizes[i][0]);  // 각 배열의 첫번째 값 중 비교해서 최댓값이 들어감

            // 최대값들 중 최대값을 찾기
            maxSecond = Math.max(maxSecond, sizes[i][1]);  // 마찬가지로 두번째 값 중 비교해서 최댓값

            // 두값을 곱하기
            answer = maxFirst * maxSecond;
        }
        // 첫 번째 값들 중 큰 값과 두 번째 값들 중 큰 값을 찾기
//        int maxFirst = Math.max(sizes[0][0], sizes[1][0]);
//        int maxSecond = Math.max(sizes[0][1], sizes[1][1]);

        return answer;
    }
}

