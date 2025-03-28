import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] lowScore = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder()); // 내림차순

            if(list.size() > k){    // list의 사이즈가 k일경우
                // k개 초과하면 삭제해주기
                list.remove(list.size()-1);
            }

            lowScore[i] = list.get(list.size() - 1);
        }
        
        return lowScore;
    }
}