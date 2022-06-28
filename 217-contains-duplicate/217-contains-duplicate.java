class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashmaps = new HashMap<>();
        
        for(int num: nums){
            if(hashmaps.containsKey(num)){
                int value = hashmaps.get(num);
                hashmaps.put(num, value + 1);
            }
            else{
                hashmaps.put(num, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: hashmaps.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}