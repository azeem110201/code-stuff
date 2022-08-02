class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        
        int i = 1;
        int count = 0;
        
        while(i < nums.length){
            if(nums[i] == nums[i - 1]){
                count++;
                int j = i + 1;
                while((j < nums.length) && (nums[j] == nums[i-1])) {
                    count++;
                    j++;
                }
            }
            i++;
        }
        
        return count;
    }
}