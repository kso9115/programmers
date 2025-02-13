class Solution {
    public String solution(int n) {
        String answer = "";

        if(n%2 ==0){
            while (n!=0){
            answer += n%2==0 ? "수": "박";
                n--;
            }
        } else {
            while (n!=0){
            answer += n%2!=0 ? "수": "박";
                n--;
            }
        }
        
        return answer;
    }
}