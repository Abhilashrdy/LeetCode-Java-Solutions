class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ans = strs[0].length();
        for(int i = 0 ; i < strs[0].length() ; i++){
            char ch = strs[0].charAt(i);
            boolean equal = true;
            for(int j = 1 ; j < strs.length ; j++){
                if(i >= strs[j].length()){equal = false;break;}
                if(strs[j].charAt(i) != ch){equal = false;break;}
            }
            if(!equal){ans = i;break;}
        }
        return strs[0].substring(0,ans);
    }
}
