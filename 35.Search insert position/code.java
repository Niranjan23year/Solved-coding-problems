class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int m=start+(end-start)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                end=m-1;
            }
            else{
                start=m+1;
            }
        }
        return start;
    }
}