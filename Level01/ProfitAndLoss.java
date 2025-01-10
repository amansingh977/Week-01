class ProfitAndLoss {
	public static void main(String[] args) {
		
		int costPrice = 129;
		
		int sellingPrice = 191;
		
		// Calculate Profit 
		int profit = sellingPrice-costPrice;
		
		// Calculate Profit Percentage
		float profitPercentage = ((float)profit/(float)costPrice)*100;
		
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
		
	}
}