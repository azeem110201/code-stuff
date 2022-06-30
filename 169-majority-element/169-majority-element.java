class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int currElement = 0;
        
        for(int num: nums){
            if(count == 0) currElement = num;
            if(currElement == num) count++;
            else count--;
        }
        return currElement;
    }
}