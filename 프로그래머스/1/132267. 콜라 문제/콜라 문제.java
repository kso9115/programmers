class Solution {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;

        // 가지고 있는 병이 마트에 갖다줘야하는것보다 작으면 X
        while(n >= a) {
            int newCoke = (n/a)*b;
            totalCoke += newCoke;
            // 바꾸지못한 나머지 콜라 + 새로받은 콜라 => 바꿔야하는 콜라 전체 개수
            n = (n%a) + newCoke;
        }
        
        return totalCoke;
    }
}