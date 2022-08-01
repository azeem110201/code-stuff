class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        
        for(int i = 0, j = nums.length; i < (nums.length) && (j < nums.length * 2); i++, j++) {
            newNums[i] = nums[i];
            newNums[j] = nums[i];
        }
        
        return newNums;
    }
}