class Solution {
    public boolean solution(String s) {

        String [] str = s.split("");
        StringBuilder sb = new StringBuilder();


        if(str.length == 4 || str.length == 6){
            for(int i = 0; i<str.length; i++){
                
                // 너무 단순무식해
                // 변환을 할 경우.. 숫자가 아닌값이 들어올 떄 NumberFormatException 발생..
                // 그래서 문자가 숫자인지 아닌지 확인하는 메서드를 찾았다ㅠㅠ
                // Character.isDigit(c)
                if(Character.isDigit(str[i])){
                    sb.append(str[i]);
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}