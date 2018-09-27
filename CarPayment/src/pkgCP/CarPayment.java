package pkgCP;

public class CarPayment {
	private int carCost;
	private int downPayment;
	private int lengthOfLoans; 
	private double interestRate;
	
	public CarPayment(int cost, int downpay, int lengofloan, double intrate){
		carCost = cost;
		downPayment = downpay;
		lengthOfLoans = lengofloan;
		interestRate = intrate;
	}
	
	
	public double monthlyPayment(){
		double monthlyPay = ((interestRate / 12) * (carCost - downPayment)) / (1 - Math.pow(1 + (interestRate / 12), (lengthOfLoans * - 1)));
		return (double) monthlyPay;
		
				
	}
		
	public double totalInterest() {
		double totalInter = ((monthlyPayment() * lengthOfLoans) - carCost);
		return (double) totalInter;
				
	}
		
		
	
}
