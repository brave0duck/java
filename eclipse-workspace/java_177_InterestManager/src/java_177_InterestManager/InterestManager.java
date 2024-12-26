/**
 * 기간에 따른 이자율계산 
 */
package java_177_InterestManager;
import java.text.NumberFormat;



public class InterestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long AMOUNT = 100_000_000;
		double total= 0L;
		double nInterest=0.0;


		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		InterestManager Interest = new InterestManager();
		for(int n=1; n<=365;n++) {
			nInterest = Interest.getInterestRate(n);
			System.out.printf("%3d day interest : %.1f%% , ", n, nInterest*100 );
			total = AMOUNT * nInterest;
			String formattedNumber = numberFormat.format((total+AMOUNT));
			System.out.println("총액 : " + formattedNumber + "원");

//			System.out.printf(", Amount : %10.0f \n", (total+AMOUNT));
		}
		
	}
	public double getInterestRate(int day) {
		double rate=0.0;
		if(day>= 1 && day <= 90)
			rate = 0.005;
		else if( day>=91 && day<= 180)
			rate= 0.01;
		else if(day>= 181 && day<= 364)
			rate= 0.02;
		else if(day>= 365)
			rate= 0.056;
		
		return rate;
	}

	public double calculateAmount(int day, long amount) {
		InterestManager Interest = new InterestManager();
		double rate = 0.0;
		rate = Interest.getInterestRate(day);
		amount += (amount * rate);
		
		return amount;
		
	}
}
