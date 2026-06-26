class Solution {
    public int repeatedStringMatch(String a, String b) {
       StringBuilder str = new StringBuilder();
       str.append(a);
       int len = a.length()-1+b.length()+a.length()-1;
       while(str.length() < len){
        if(str.toString().contains(b))break;
        str.append(a);
       } 
       if(!str.toString().contains(b))return -1;
       return str.length()/a.length();
    }
}
