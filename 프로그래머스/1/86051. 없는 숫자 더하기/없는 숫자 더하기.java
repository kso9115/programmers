class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 0~9의 합 45
        // 배열을 더하기
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        
        return 45-answer;
        
        
        
    }
}