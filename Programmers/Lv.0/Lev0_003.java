public class Lev0_003 {

    public int solution(int[] num_list) {
        int answer = 0;

        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();

        for (int j : num_list) {
            if (j % 2 != 0) {  // 홀수
                a.append(j);
            }else{
                b.append(j);
            }
        }
        int asum = Integer.parseInt(a.toString());
        int bsum = Integer.parseInt(b.toString());
        answer = asum+bsum;
        return answer ;
    }
}




