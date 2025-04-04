import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int result = nums.length/2;
        int[] resultArr = Arrays.stream(nums).distinct().toArray();
        
        if(resultArr.length>result){
            return result;
        } else {
            return resultArr.length;
        }
        
        
    }
}