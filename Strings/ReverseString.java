class Solution {
    public void reverseString(char[] s) {
        reverseStr(s,0,s.length-1);
    }
    void reverseStr(char[] s,int start , int end){
        if(start > end){
            return;
        }
        char temp = s[start];
        s[start]= s[end];
        s[end]= temp;
        start++;
        end--;
        reverseStr(s,start,end);
    }
}
