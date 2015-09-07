
//Sam Kiernan
//CSE002
//Homework Assignment 2
//September 7 2015
//Professor Eric Fouh
public class Arithmetic {
	public static void main(String[] args){
		//Number of pairs of socks
		int nSocks = 3;
		//Cost per pair of socks
		//(In Dollars and Cents)
		double sockCost = 2.58;
		
		//Number of drinking glasses
		int nGlasses = 6;
		//Cost per glass
		//(In Dollars and Cents)
		double glassCost= 2.29;
		
		//Number of boxes of envelopes
		int nEnvelopes = 1;
		//cost per box of envelopes
		//(In Dollars and Cents)
		double envelopeCost = 3.25;
		
		double taxPercent = 0.06;
		
		//Total cost of socks before tax
		double totalSockCost = nSocks*sockCost;
		//Sales Tax
		double sockSales = (totalSockCost*taxPercent);
		//Cost with Tax
		double finalSock = sockSales+totalSockCost;
		//Calculating to clean up the decimal on finalSock
		double finalSockX = (finalSock*100);
		double finalSockY = (int)finalSockX;
		double finalSockZ = finalSockY/100;

		//Total cost of drinking glasses before tax
		double totalGlassCost = nGlasses*glassCost;
		//Sales Tax
		double glassSales = (totalGlassCost*taxPercent);
		//Cost with Tax
		double finalGlass = glassSales+totalGlassCost;
		//Calculating to clean up the decimal on finalGlass
		double finalGlassX = (finalGlass*100);
		double finalGlassY = (int)finalGlassX;
		double finalGlassZ = finalGlassY/100;
		
		//Total cost of envelopes before tax
		double totalEnvelCost = nEnvelopes*envelopeCost;
		//Sales Tax
		double envelSales = (totalEnvelCost*taxPercent);
		//Cost with Tax
		double finalEnvel = envelSales+totalEnvelCost;
		//Calculating to clean up the decimal on finalEnvel
		double finalEnvelX = (finalEnvel*100);
		double finalEnvelY = (int)finalEnvelX;
		double finalEnvelZ = finalEnvelY/100;
		
		//Individual Sales Tax
		//Sock
		double sockTaxX = (int)(100*(sockCost*taxPercent));
		double sockTax = sockTaxX/100;
		//Glass
		double glassTaxX = (int)(100*(glassCost*taxPercent));
		double glassTax = glassTaxX/100;
		//Envel
		double envelTaxX = (int)(100*(envelopeCost*taxPercent));
		double envelTax = envelTaxX/100;
		
		//Printing out the results
		//Printing Sock Values
		System.out.println("The number of socks bought were " + 
		nSocks + " socks at a price of $" + sockCost + " per Sock");
		//Printing Glasses Values
		System.out.println("The number of glasses bought were " + 
		nGlasses + " glasses at a price of $" + glassCost + " per Glass");
		//Printing Envelope Values
		System.out.println("The number of envelopes bought were " + 
		nEnvelopes + " envelopes at a price of $" + envelopeCost + " per Envelope");
		System.out.println(" ");
		
		//Sock and Sales Tax
		System.out.println("Each sock at a price of $" + sockCost + " had a sales tax of $" + sockTax);
		//Glasses and Sales Tax
		System.out.println("Each glass at a price of $" + glassCost + " had a sales tax of $" + glassTax);
		//Envelopes and Sales Tax
		System.out.println("Each envelope at a price of $" + envelopeCost + " had a sales tax of $" + envelTax);
		System.out.println(" ");
		
		//Cleaning up Total Socks Sales Tax
		double sockTaxQ = (int)(100*(sockTax*nSocks));
		double sockTaxP = sockTaxQ/100;
		//Cleaning up Total Glasses Sales Tax
		double glassTaxQ = (int)(100*(glassTax*nGlasses));
		double glassTaxP = glassTaxQ/100;
		//Cleaning up Total Envelopes Sales Tax
		double envelTaxQ = (int)(100*(envelTax*nEnvelopes));
		double envelTaxP = envelTaxQ/100;
		
		//Computing the totals
		//Total before tax
		double totalPrice = totalSockCost + totalGlassCost + totalEnvelCost;
		//Total Sales Tax
		double totalSalesTax = sockTaxP + glassTaxP + envelTaxP;
		//Final Price With Tax
		double finalPrice = totalPrice + totalSalesTax;
		
		
		
		//Total Cost of Socks after Sales Tax
		System.out.println("The total cost of all items before Tax is $"+totalPrice+", "
		+ "the total Sales Tax is $"+totalSalesTax+", the total cost after Tax is $" + finalPrice + ".");
		
		
	}

}
