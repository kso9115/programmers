class Solution {
    public String solution(String s) {
        
        String arr [] = new String[s.length()];

        arr = s.split("");

        if(s.length() % 2 == 0 ){
            return arr[(arr.length/2)-1]+arr[(arr.length/2)];
        } else {
            return arr[(arr.length+1)/2-1];
        }
    }
}