class Solution {
    public int minimumLength(String s) {
        int count = s.length();
        int start = 0 , end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return count;
            }
            while(start < end&&s.charAt(start) == s.charAt(start+1)){
                start++;
                count--;
            }
            while(start < end&&s.charAt(end) == s.charAt(end-1)){
                end--;
                count--;
            }
            count -= 2;
            start ++;
            end--;
        }
        if(count < 0) return 0;
        return count;  
    }
}
