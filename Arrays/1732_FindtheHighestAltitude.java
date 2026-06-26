class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int max =0 ;
        for(int i =0 ; i<gain.length+1; i++){
            if(i == 0){
                altitude[i] = 0;
            }
            else{
            altitude[i] = altitude[i-1]+gain[i-1];
            }
            if(altitude[i]>max){
                max = altitude[i];
            }
        }
        return max;
    }
}
