package run;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
 * 
 * warn includes error, fatal, off
 * 
 * 
 * string builder string buffer , string gap
 * String.format과  str + str : 속도 차이
 * https://logging.apache.org/log4j/2.x/manual/api.html 정리
 */
public class Run {
	
	public static void main(String[] args) {
		// RootLogger호출
		Logger logger = LogManager.getLogger();

//		System.out.println(String.format("User id [%s]", userid));
		
		
		logger.info("main start!");
		StartClass startClass = new StartClass();
		startClass.startMethod();
		
		
	}
}
