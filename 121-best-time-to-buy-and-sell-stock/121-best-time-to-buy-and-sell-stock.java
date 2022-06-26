class Solution {
    public int maxProfit(int[] prices) {
        // O(n^2)
//         int maxiProfit = 0;
        
//         for(int i = 0; i < prices.length - 1; i++){
//             for(int j = i + 1; j < prices.length; j++){
//                 if(prices[i] > prices[j]){
//                     continue;
//                 }
//                 int profit = prices[j] - prices[i];
//                 maxiProfit = Math.max(maxiProfit, profit);
//             }
//         }
        
//         return maxiProfit;
        
        
        int[] temp = new int[prices.length];
        
        temp[prices.length - 1] = prices[prices.length - 1];
        
        int i = temp.length - 1, j = prices.length - 2;
        
        while(j >= 0){
            if(prices[j] >= temp[i]){
                temp[i-1] = prices[j];
            }
            else{
                temp[i-1] = temp[i];
            }
            
            i--;
            j--;
        }
        
        i = 0;
        
        int maxiProfit = 0;
        
        while(i < temp.length - 1){
            maxiProfit = Math.max(maxiProfit, temp[i] - prices[i]);
            i++;
        }
        
        return maxiProfit;
        
        
    }
}