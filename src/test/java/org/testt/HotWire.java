package org.testt;

import org.testng.annotations.Test;

public class HotWire extends BaseClass {
	
	@Test
	private void test() throws InterruptedException {
	
		browserLaunch("firefox");		
		launchUrl("https://www.hotwire.com/");
		implicityWait(30);
       
		Fightbtn p=new Fightbtn();
		p.Jana();
		
		Carinfo c=new Carinfo();
		c.Green();		
	
		Hotal h=new Hotal();
		h.hadrine();
	
}
}