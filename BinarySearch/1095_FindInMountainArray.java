/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0 , end = mountainArr.length()-1;
        int peak = peakIndex(mountainArr , start , end);
        int ans = BinarySearch(target,mountainArr,0,peak);
        return ans != -1?ans:BinarySearch2(target,mountainArr,peak+1,end);
        
    }
    int BinarySearch(int target , MountainArray arr,int start,int end){
        while(start <= end){
            int mid = start+ (end - start)/2;
            int Xmid = arr.get(mid);
            if(Xmid == target){
                return mid;
            }
            else if(Xmid > target){
                end = mid - 1;
            }
            else start = mid +  1;
        }
        return -1;
    }
    int BinarySearch2(int target , MountainArray arr,int start,int end){
        while(start <= end){
            int mid = start+ (end - start)/2;
            int Xmid = arr.get(mid);
            if(Xmid == target){
                return mid;
            }
            else if(Xmid > target){
               start = mid +  1;
            }
            else  end = mid - 1;
        }
        return -1;
    }
    int peakIndex(MountainArray arr,int start , int end){
        while(start< end){
            int mid = start + (end - start)/2;
            int Xmid = arr.get(mid);
            int Xmid2= arr.get(mid+1);
            if(Xmid > Xmid2 ) end = mid;
            else start = mid+1;
        }
        return start;
    }
}
