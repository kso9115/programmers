class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String ele = "";
        String answer[] = new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) { // 5회전
            String arr1Ele = Integer.toBinaryString(arr1[i]);
            String arr2Ele = Integer.toBinaryString(arr2[i]);

            if(arr1Ele.length() !=n){
                arr1Ele = String.format("%" + n + "s", arr1Ele).replace(' ', '0');
            }
            if(arr2Ele.length() !=n){
                arr2Ele = String.format("%" + n + "s", arr2Ele).replace(' ', '0');
            }
            //System.out.println(arr1Ele);
            //System.out.println(arr2Ele);
            ele = "";

            for (int j = 0; j < n; j++) {
                if(arr1Ele.charAt(j) == '1' || arr2Ele.charAt(j) == '1'){
                    ele += "#";
                } else {
                    ele += " ";
                }

            }

            answer[i] = ele;
            //System.out.println(answer[i]);
        }
        return answer;
    }
}