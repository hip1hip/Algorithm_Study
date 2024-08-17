import java.util.Arrays;
import java.util.stream.IntStream;

public class Lev0_004 {

    public int[] solution(int[] num_list) {
        int[] answer = {};
//        int a = 0;

        int[] a = null;
        int[] b = null;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            a = new int[]{num_list[num_list.length - 1] - num_list[num_list.length - 2]};
            answer = IntStream.concat(Arrays.stream(num_list),Arrays.stream(a)).toArray();
        } else {
            b = new int[]{num_list[num_list.length - 1] * 2};
            answer = IntStream.concat(Arrays.stream(num_list),Arrays.stream(b)).toArray();
        }

//        answer = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();


        return answer;
    }
}