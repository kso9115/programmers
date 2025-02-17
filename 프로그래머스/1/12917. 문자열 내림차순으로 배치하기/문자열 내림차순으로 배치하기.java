import java.util.*;

class Solution {
    public String solution(String s) {
        String [] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        
        // 배열을 다시 문자열로
        StringBuilder sb = new StringBuilder();
        for(String str2 : str){
            sb.append(str2);
        }
        return sb.toString();
        
    }
}