class Solution {
    public int solution(String t, String p) {
        
        int count = 0;
        for(int i = 0; i<t.length()-p.length()+1; i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i,i+p.length()))){
                count++;
            } // if
        } // for
               
               return count;
    }
               
               
               
}