class Solution {
    public boolean judgeCircle(String moves) {
        int Ucount = 0 , Dcount = 0,Lcount = 0,Rcount = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R')Rcount++;
            else if(ch == 'L')Lcount++;
            else if(ch == 'U')Ucount++;
            else Dcount++;
        }
        return Rcount == Lcount && Ucount == Dcount;
    }
}
