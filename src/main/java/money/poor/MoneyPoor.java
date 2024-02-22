package money.poor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import run.Run;

public class MoneyPoor implements Runnable {

	private Poor p;
	


	public MoneyPoor(Poor p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		Logger logger = LogManager.getLogger("poor");
		
		logger.info("거지1시작됨");
		// TODO Auto-generated method stub
		
		while(true) {
			
			try {
				
				p.increase();
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.error("err !" + e);
			}
		}
		
		
	}
	
	
}
