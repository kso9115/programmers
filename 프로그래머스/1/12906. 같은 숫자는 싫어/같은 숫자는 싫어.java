import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){       
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        // 음 ?ㅠ다시복사해줘야함 이런젠장
        int [] answer = new int[list.size()];
        for(int n = 0; n < list.size(); n++){
            answer[n] = list.get(n);
        }
        

        return answer;
    }
}