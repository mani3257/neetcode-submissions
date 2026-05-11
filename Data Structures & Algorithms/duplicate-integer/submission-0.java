class Solution {
    public boolean hasDuplicate(int[] nums) {
        // brute force: 2 for loops t.c = O(n^2) s.c = O(n)
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}