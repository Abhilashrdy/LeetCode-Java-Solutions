class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())return -1;
       for(int i = 0 ; i <= haystack.length()-needle.length() ; i++){
        int k = i , j = 0;
        while(j < needle.length()){
            if(needle.charAt(j) != haystack.charAt(k))break;
            j++;
            k++;
        }
        if(j == needle.length())return i;
       }
       return -1;
    }
}
