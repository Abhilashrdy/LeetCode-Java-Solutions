class Solution {
    public int calculate(String s) {
       int len = s.length(), sign = 1, curr_no = 0, ans = 0;
       Stack<Integer> stack = new Stack<Integer>();
       for(int i = 0 ; i < len ; i++){
        char ch = s.charAt(i);
        if(ch >= '0' && ch <= '9'){
            curr_no = s.charAt(i) - '0';
         while(i+1 < len && Character.isDigit(s.charAt(i+1))){
         curr_no = curr_no * 10 + s.charAt(i + 1) - '0';
         i++;
         }
         curr_no = curr_no * sign;
        ans += curr_no;
        curr_no = 0;
        sign = 1; 
        }
        else if( ch == '+'){
            sign = 1;
        }
        else if(ch == '-'){
            sign = -1;
        }
        else if(ch == '('){
            stack.push(ans);
            stack.push(sign);
            ans = 0;
            sign = 1;
        }
        else if(ch == ')'){
            int presign = stack.pop();
            ans = ans*presign;
            int preans = stack.pop();
            ans = preans + ans;
        }
        
       }
       return ans;

    }
}
