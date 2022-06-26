class Solution {
    public boolean isPalindrome(String s) {
        if(s == " "){
            return true;
        }
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}