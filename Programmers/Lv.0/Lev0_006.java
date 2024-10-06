//https://school.programmers.co.kr/learn/courses/30/lessons/181939
//더 크게 합치기

class Solution {
  public int solution(int a, int b) {
    int answer = 0;
    String str1 =Integer.toString(a)+Integer.toString(b);
    String str2 =Integer.toString(b)+Integer.toString(a);

    String str3 = Integer.parseInt(str1) > Integer.parseInt(str2)? str1 : str2;

    answer = Integer.parseInt(str3);
    return answer;
  }
}