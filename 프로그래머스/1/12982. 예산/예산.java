import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        
        Arrays.sort(d);        
        
        while(count < d.length && budget >= d[count]){
	        budget -= d[count];
            count++;
        }
        
        return count;
    }
}