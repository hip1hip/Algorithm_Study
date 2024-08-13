class Lev0_001 {
    public int Lev0_001(int[] num_list) {
        int answer = 0;
        int totalSum = 0;
        int totalMulti = 1;

        for (int num : num_list) {
            totalSum += num;
            totalMulti *= num;
        }
        System.out.println(totalMulti);
        if ((totalSum * totalSum) > totalMulti) {
            answer = 1;
        }
        return answer;
    }
}