class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 1){
            return false;
        }
       long start = 1 ;
        long end = num;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid  == num){
                return true;
            }
            else if(mid*mid > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false; /*
        if( num == 0 || num == 1){
            return true;
        }
        else{
        for(int i = 0 ; i <= num/2 ; i++){
            if(i*i == num){
                return true;
            }
        }
        }
        return false;*/
    }
}
    
