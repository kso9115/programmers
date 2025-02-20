class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        
        System.out.println(arr1.length);     // 행의 개수
        System.out.println(arr1[0].length);  // 첫 번째 행의 열의 길이
        
        for(int i=0; i<arr1.length; i++){
            
            // 행별 열의 길이?
            for(int j=0; j<arr1[i].length; j++){
                 answer [i][j] = arr1[i][j] + arr2[i][j];     
            }
        
        }
        
        return answer;
    }
}