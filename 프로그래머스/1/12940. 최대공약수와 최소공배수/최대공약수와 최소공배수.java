import java.util.*;
class Solution {
    public int[] solution(int n, int m) {

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                listA.add(i);
            }
        }

        for (int j = 1; j <= m; j++) {
            if (m % j == 0) {
                listB.add(j);
            }
        }

        List<Integer> duplicates = new ArrayList<>(listA);
        duplicates.retainAll(listB);

        int max = Collections.max(duplicates);
        int min = (n * m) / max;
        
        return new int[]{max, min};
    }
}
