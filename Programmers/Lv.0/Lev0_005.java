// 분수의 덧셈 https://school.programmers.co.kr/learn/courses/30/lessons/120808

public class Lev0_005 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {

    int b = denom1 * denom2 ;
    int a = (numer1 * denom2) + (denom1 * numer2) ;

    int max = 1;

    for (int i = 1; i <= a && i <= b; i ++){
      if ( a % i == 0 && b % i == 0  ){
        max = i ;
      }
    }
    a = a/ max ;
    b = b/ max ;
    int [] answer = {a, b};
    return answer ;
  }
}