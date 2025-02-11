class Solution {
    public int[] solution(int[] arr) {
        int answer[] = new int [arr.length - 1];
        int min = arr[0];
        int count = 0;
        
        if( arr.length == 1){
            // -1 반환
            return new int[]{-1};
        } else {
        for(int i = 0; i<arr.length; i++){
	        if(arr[i] < min) {
	            min = arr[i];
	            count = i;
	            }   
            }
        }
        
        for(int i = 0, j=0; i<arr.length; i++){
	        if(i == count){
                // 가장 작은 값의 인덱스는 건너뛰기
	            continue;
	        }
            // arr 배열의 값 건니뛴 후에도 인덱스 유지하기 위해 j사용
            answer[j++] = arr[i];
        }


return answer;
        
        
    }
}