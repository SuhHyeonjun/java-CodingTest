class 콜라츠추측 {
    public int solution(int num) {
        long n = num; // int 로 할 시 짝수, 홀수를 반복하다 표현가능한 범위인 21억을 넘어가 오버플로우 발생
        int answer = 0;
        
        // n = 1 이거나 500번 반복하면 종료
        while(n != 1) { 
        if (n%2==0) {
            n/=2;
        } else {
            n = n * 3 + 1;
        }
            answer++;
            
            if (answer > 500) return -1;

        }
        return answer;
    }
}