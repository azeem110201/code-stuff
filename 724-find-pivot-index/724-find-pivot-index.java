class Solution {
    public int pivotIndex(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
            int leftSum = 0;
            int rightSum = 0;
            
            int leftIndex = i - 1;
            int rightIndex = i + 1;
            
            if(leftIndex < 0){
                leftIndex = -1;
            }
            if(rightIndex >= nums.length){
                rightIndex = nums.length;
            }
            if(leftIndex != -1){
                while(leftIndex >= 0){
                    leftSum += nums[leftIndex];
                    leftIndex--;
                }
            }
            if(rightIndex != nums.length){
                while(rightIndex < nums.length){
                    rightSum += nums[rightIndex];
                    rightIndex++;
                }
            }
            
            if(leftSum == rightSum){
                return i;
            }
            
            i++;
        }
        return -1;
    }
}