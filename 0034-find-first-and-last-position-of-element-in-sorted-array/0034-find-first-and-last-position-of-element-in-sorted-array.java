class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] != target){
            return new int[]{ -1, -1 };
        }
        
        if(nums.length == 1 && nums[0] == target){
            return new int[]{ 0, 0 };
        }
        
        int first = 0;
        int last = nums.length - 1;
        
        while(first <= last){
            if(nums[first] != target) first++;
            if(nums[last] != target) last--;
            
            if(nums[first] == target && nums[last] == target) break;
        }
        
        if(first > last){
            return new int[]{-1, -1};
        }
        
        return new int[]{first, last};
        
        
    }
}