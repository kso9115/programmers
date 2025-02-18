class Solution {
    public int solution(int left, int right) {
        // 합계 반환
        int sum = 0;
        
        for(int i = left; i<=right; i++){
            int count = 0;
            
            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    // 나눠질 때
                    count++;
                }
            }
            
            sum = count % 2 == 0 ? sum +i : sum -i;
        }
        
        return sum;
        
        
        
    }
}