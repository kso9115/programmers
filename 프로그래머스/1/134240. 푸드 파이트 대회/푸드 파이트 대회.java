class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <food.length; i++) {
            if(food[i]/2 > 0){
                // sb.append(String.valueOf(i).repeat(angel[i] / 2));
                for (int j = 0; j < food[i]/2; j++) {
                    sb.append(i);
                }
            }
        }

        String answer = sb.toString()+"0"+sb.reverse().toString();
        return answer;
    }
}