package utilities;

public class CurrencyConverter {
	public static final double iof = 1.0 + (6.0/100.0);
	
	public static double converter(double dollarPrice, double valueForConverter) {
		return (dollarPrice * valueForConverter) * iof;
	}
}
