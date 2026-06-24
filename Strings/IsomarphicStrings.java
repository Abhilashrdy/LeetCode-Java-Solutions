class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] str = new char[1000];
        int[] arr = new int[1000];
        for(int i = 0 ; i < t.length() ; i++){
            if(arr[s.charAt(i)] == 0){str[t.charAt(i)] = s.charAt(i);arr[s.charAt(i)]++;}
        }
        StringBuilder st = new StringBuilder();
        for(char ch : t.toCharArray()){
            st.append(str[ch]);
        }
        return st.toString().equals(s);
    }
}
