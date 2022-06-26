class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagram = new HashMap<>();
        
        for(char i: s.toCharArray()){
            if(anagram.containsKey(i)){
                int value = anagram.get(i);
                anagram.put(i, value + 1);
            }
            else{
                anagram.put(i, 1);
            }
        }
        
        for(char i: t.toCharArray()){
            if(anagram.containsKey(i)){
                int value = anagram.get(i);
                anagram.put(i, value - 1);
            }
            else{
                anagram.put(i, 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry: anagram.entrySet()){
            if(entry.getValue() > 0){
                return false;
            }
        }
        
        return true;
    }
}