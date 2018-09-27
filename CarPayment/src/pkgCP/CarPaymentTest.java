package pkgCP;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarPaymentTest {
	
	CarPayment un = new CarPayment(35000, 0, 60, .10);
	

	@Test
	public void Carpayment_test() {
		assertEquals(un.monthlyPayment(), 743.65);		
	}
	@Test
	public void totalInterest_test() {
		assertEquals(un.totalInterest(), 9618.79);		
	}
}
