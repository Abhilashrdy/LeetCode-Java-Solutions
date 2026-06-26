class Solution {
    public String multiply(String num1, String num2) {
        int[] arr =new int[num1.length() + num2.length()];
        for(int i = num2.length()-1 ; i >= 0 ; i--){
            for(int j = num1.length()-1 ; j >= 0 ; j--){
                int k = i+j , k1= i+j+1;
                int pdct = (num1.charAt(j)-'0')*(num2.charAt(i)-'0');
                int sum = arr[k1]+pdct;
                arr[k1] = sum%10;
                arr[k] += sum/10;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int num : arr)if(!(str.length() == 0 && num == 0))str.append(num);
        return str.length() == 0 ? "0":str.toString();
    }
}
