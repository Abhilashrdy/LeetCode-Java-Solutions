class Solution {
    public boolean halvesAreAlike(String s) {
      int a = 0,b =0;
        String vowel = "aeiouAEIOU";
        for(int i = 0 ; i < s.length()/2 ; i++){
            for(int j = 0 ; j < vowel.length() ; j++){
                if(s.charAt(i) == vowel.charAt(j)){
                    a++;
                }
            }
        }
            for(int i = s.length()-1 ; i >= s.length()/2 ; i--){
            for(int j = 0 ; j < vowel.length() ; j++){
                if(s.charAt(i) == vowel.charAt(j)){
                    b++;
                }
            }
        }
        return a==b;  
    }
}
