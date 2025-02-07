class Solution {
    public int solution(int num) {
        // int 타입으로 선언했을 때 오버플로우 발생할 수 있음
        // 예를들어 num값을 연산하는 과정에서 int의 최대값을 넘겨버리면 오버플로우 발생하여 잘못된 값이 들어간다
        long n = num;
        int count = 0;
            
        while(n != 1){
            if(n % 2 == 0){
                n/=2;
            } else {
                n = n*3+1;
            }     
            
            count++;
            
            if(count >= 500) {
                return -1;
            }
        }
        
        
        return count;
    }
}