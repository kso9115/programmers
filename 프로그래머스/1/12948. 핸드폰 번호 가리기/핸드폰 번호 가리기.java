class Solution {
    public String solution(String phone_number) {
        
        String[] strArr = new String[phone_number.length()];
        
        strArr = phone_number.split("");
        for (int i = 0; i < strArr.length-4; i++) strArr[i] = "*";

        StringBuilder strb = new StringBuilder();
        for(String s:strArr){
            strb.append(s);
        }
        return strb.toString();
        
    }
}