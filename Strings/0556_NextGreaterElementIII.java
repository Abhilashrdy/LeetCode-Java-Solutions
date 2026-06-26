class Solution {
    public int nextGreaterElement(int n) {
        if(n < 0 ||n  >= 2147483486)return -1;
        if(n == 1999999999)return -1;
        StringBuilder str = new StringBuilder();
        str.append(n);
        int[] arr = new int[str.length()];
        int i = arr.length-1;
        for(char ch : str.toString().toCharArray()){arr[i] = ch-'0';i--;}
        i = 1;
        boolean swapped = false;
        while(i < arr.length){
            int j = 0;
            while(j < i){
                if(arr[j] > arr[i]){
                    swap(arr,j,i);
                    swapped = true;
                    break;
                }j++;
            }
            if(swapped)break;
            i++;
        }
        if(swapped){
        for(int j = 0 ; j < i ; j++){
            swapped = false;
            for(int k = 0 ; k < i-1 ; k++){
                if(arr[k] < arr[k+1]){
                    swap(arr,k,k+1);
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        }
        int res = 0;
        i = arr.length-1;
        while(i >= 0){res = (res*10)+arr[i] ; i--;}
        return res == n ? -1 : res;
    }
    void swap(int[] arr,int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
