import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // 스택에 cards1, cards2 넣어주기
        Stack cardOne = new Stack();
        Stack cardTwo = new Stack();
        String answer = "No";

        for (int i = cards1.length; i > 0; i--) {
            cardOne.push(cards1[i-1]);
        }

        for (int i = cards2.length; i > 0; i--) {
            cardTwo.push(cards2[i-1]);
        }
        
        for (int i = 0; i < goal.length; i++) {
            //goal[i].equals(cardOne)
            if (!cardOne.isEmpty() && goal[i].equals(cardOne.peek())) {
                cardOne.pop();
            } else if (!cardTwo.isEmpty() && goal[i].equals(cardTwo.peek())) {
                cardTwo.pop();
            } else {
                return "No";
            }

            answer = "Yes";
        }
        
        return answer;
        
    }
}