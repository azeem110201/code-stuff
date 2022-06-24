class Solution {
    public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> hashmap = new HashMap<>();
        
//         for(int i = 0; i < nums.length; i++){
//             hashmap.put(nums[i], i);
//         }
        
//         for(int i = 0; i < nums.length; i++){
//             int complement = target - nums[i];
//             if(hashmap.containsKey(complement) && hashmap.get(complement) != i){
//                 return new int[]{i, hashmap.get(complement)};
//             }
//         }
        
//         return new int[]{-1, -1};
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{-1, -1};
    }
}