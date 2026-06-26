class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
       String ans ="";
       int count = 0;
       for(int i = 0 ; i < s.length() ; i++){
        if(s.charAt(i) == ' '){
            if(++count >= 2) ans += " ";
            sb.reverse();
            ans += sb;
            sb.delete(0,sb.length());
        }
        else{
            sb.append(s.charAt(i));
        }
       }
       if(count==0){
        return ans+sb.reverse();
       }
       return ans+" "+sb.reverse(); 
    }
}
