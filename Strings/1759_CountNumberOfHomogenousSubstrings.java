class Solution {
    public int countHomogenous(String s) {
        int ans = 0 , count = 0 , mod = (int)1e9 + 7;
        for(int i = 0 ; i < s.length() ; i++){
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            count++;
            while(count > 0){
                ans = (ans+count)%mod;
                count--;
            }
        }
        return ans;
    }
}
