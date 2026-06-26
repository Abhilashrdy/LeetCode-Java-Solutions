class Solution {
    public int romanToInt(String s) {
        int num = 0,res = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int curr = helper(s.charAt(i));
            if(num < curr){
                res += (curr-2*num); 
            }
            else {
                res += curr;
            }
                num = curr;
        }
        return res;
    }
    int helper(char ch){
        if(ch == 'I')return 1;
        if(ch == 'V')return 5;
        if(ch == 'X')return 10;
        if(ch == 'L')return 50;
        if(ch == 'C')return 100;
        if(ch == 'D')return 500;
        return 1000;
    }
}
