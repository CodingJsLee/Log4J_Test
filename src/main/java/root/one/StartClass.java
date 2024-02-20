package root.one;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import poor.inf.ui.Inf;
import root.poor.Poor;
import root.two.MoneyPoor;

public class StartClass {
	/**
	 * ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
	 * warn includes error, fatal, off
	 */
	private static final Logger logger = LogManager.getLogger(StartClass.class);
	
	private Poor p = new Poor();
	
	public void startMethod() {
		
		Runnable 거지1 = new MoneyPoor(p);
		Thread 구현된거지 = new Thread(거지1);
		구현된거지.start();

		
		Runnable 거지의인터페이스 = new Inf( p);
		Thread 구현된거지인터페이스 = new Thread(거지의인터페이스);
		구현된거지인터페이스.start();

	}
	
	
	
}
