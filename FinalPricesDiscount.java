public class FinalPricesDiscount {
    //1475. Final Prices With a Special Discount in a Shop
    //https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
    //Make a double loop.
    //If the difference is greater or equal to 0, then discount the price and replace the original val and break inner loop.
    //If not, skip.
    //Return the modify prices array.
    public int[] finalPrices(int[] prices) {
        
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] - prices[j] >= 0){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }


        return prices;
    }    
}
