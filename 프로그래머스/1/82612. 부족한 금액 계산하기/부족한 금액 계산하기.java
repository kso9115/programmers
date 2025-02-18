import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        
        //return Math.abs((long)(price * count * (count+1)/2) - money);
        return Math.max((long) price * count * (count + 1) / 2 - money, 0);

    }
}