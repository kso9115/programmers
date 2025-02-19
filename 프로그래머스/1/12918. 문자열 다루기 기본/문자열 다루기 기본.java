class Solution {
    public boolean solution(String s) {

        char [] arr = s.toCharArray();
        
        // 1. 길이 안맞을경우
        if(arr.length != 4 && arr.length != 6){
            return false;
        }
        
        for(char str : arr){
            // 2. 숫자가 아닌 경우 포함
            if(!Character.isDigit(str)){
                return false;
            }
        }
        // 3. 리턴안되고 여까지오면 4,6자리 숫자라는뜻
        return true;
        
    }
}