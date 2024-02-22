package run;


import money.poor.MoneyPoor;
import money.poor.Poor;
import poor.ui.InterfacePoor;

public class StartClass {
	
	
	private Poor p = new Poor();
	
	public void startMethod() {
		
		Runnable 거지1 = new MoneyPoor(p);
		Thread 구현된거지 = new Thread(거지1);
		구현된거지.start();

		
		Runnable 거지의인터페이스 = new InterfacePoor( p);
		Thread 구현된거지인터페이스 = new Thread(거지의인터페이스);
		구현된거지인터페이스.start();

	}
	
	
	
}
