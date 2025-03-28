import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int tmp = 0;

                tmp = numbers[i] + numbers[j];
                list.add(tmp);
            }
        }
        
        list = list
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        
        int [] arr = new int [list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
        
    }
}