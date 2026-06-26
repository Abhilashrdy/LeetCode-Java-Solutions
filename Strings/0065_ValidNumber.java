
class Solution {
    public boolean isNumber(String s) {
     boolean dcaught = false, ecaught = false , Dcaught = false;
     int Countofsign = 0;
     for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        if(ch >= '0' && ch <= '9'){
            Dcaught = true;
        }
        else if(ch == '+' || ch == '-'){
            if(Countofsign == 2){
                return false;
            } 
            if(i > 0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')){
                return false;
            }
            if(i == s.length()-1){
                return false;
            }
            Countofsign++;
        }
        else if(ch == '.'){
            if(dcaught || ecaught){
                return false;
            }
            if(i == s.length()-1 && !Dcaught){
                return false;
            }
            
            dcaught = true;
        }
        else if(ch == 'e' || ch == 'E'){
            if(ecaught || !Dcaught || i == s.length()-1){
                return false;
            }
            ecaught = true;
        }
        else{
            return false;
        }
     }  
     return true;
    }
}
