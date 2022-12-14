class 이진변환반복 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {
            int one = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                }
                if (s.charAt(i) == '1') {
                    one++;
                }
            }
            s = Integer.toBinaryString(one);
            answer[0]++;
        }

        return answer;
    }
}