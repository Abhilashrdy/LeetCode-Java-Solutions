class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;
       boolean ch = false;
       for(int i = s.length()-1 ; i >= 0 ; i--){
        if(s.charAt(i) != ' ')ch = true;
        if(ch &&s.charAt(i) == ' ')break;
        if(ch)count++;
       } 
       return count;
    }
}
