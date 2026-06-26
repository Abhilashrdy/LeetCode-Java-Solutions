class Solution {
    public boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!st.isEmpty() && s.charAt(i) == ')' && s.charAt(st.peek()) == '(')st.pop();
            else if(!st.isEmpty() && s.charAt(i) == '}' && s.charAt(st.peek()) == '{')st.pop();
            else if(!st.isEmpty() && s.charAt(i) == ']' && s.charAt(st.peek()) == '[')st.pop();
            else st.push(i);
        }
        return st.isEmpty();
    }
}
