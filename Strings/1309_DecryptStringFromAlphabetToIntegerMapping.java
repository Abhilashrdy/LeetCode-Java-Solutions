class Solution {
    public String freqAlphabets(String s) {
         StringBuilder n=new StringBuilder();
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            int res;
            if(s.charAt(i)=='#'){
                res=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                i-=2;
            }
            else{
                res=s.charAt(i)-'0';
            }
        n.append((char)(res+96));
        }
        return n.reverse().toString();
    }
}
