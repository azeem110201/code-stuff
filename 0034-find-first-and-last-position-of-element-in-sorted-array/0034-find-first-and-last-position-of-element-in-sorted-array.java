class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[]{ -1, -1 };
        
        ans[0] = searchIndex(nums, target, true);
        if(ans[0] != -1){
            ans[1] = searchIndex(nums, target, false);
        }
        
        return ans;
        
    }
    
    public int searchIndex(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] < target) start = mid + 1;
            else {
                ans = mid;
                if(isFirstIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        
        return ans;
    }
}