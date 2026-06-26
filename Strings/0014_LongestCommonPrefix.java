class Solution {
    public String longestCommonPrefix(String[] strs) {
        int res = strs[0].length();
        for(int j = 0 ; j < strs.length ; j++){
            int count = 0;
            for(int k = 0 ; k < strs[j].length(); k++){
                if(k == strs[0].length())break;
                if(strs[0].charAt(k) == strs[j].charAt(k))count++;
                else break;
            }
            res = Math.min(res,count);
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < res ; i++)str.append(strs[0].charAt(i));
        return str.toString();
    }
}
