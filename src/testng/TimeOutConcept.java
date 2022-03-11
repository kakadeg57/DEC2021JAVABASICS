package testng;

import org.testng.annotations.Test;

public class TimeOutConcept {
//100 test under one suite: collection of test cases
	// loop work
	@Test(timeOut = 15000) // failed // 5th number: 1hr 
	public void loopTest() {
		int i = 1;
		do {
			System.out.println("SpeedWayTech");
		}
		while(i<2);
	}
}
