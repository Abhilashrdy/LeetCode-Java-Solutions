class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int i : candies)if(max < i)max = i;
        List<Boolean> res = new ArrayList<>();
        for(int i : candies){
            if(i + extraCandies >= max)res.add(true);
            else res.add(false);
        }
        return res;
    }
}
