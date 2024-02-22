package run;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
 * warn includes error, fatal, off
 */
public class Run {
	
	public static void main(String[] args) {
		// RootLogger호출
		Logger logger = LogManager.getLogger("run");

		
		logger.info("main start!");
		StartClass startClass = new StartClass();
		startClass.startMethod();
		
	}
}
