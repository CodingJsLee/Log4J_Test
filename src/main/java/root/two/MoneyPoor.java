package root.two;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import root.one.Run;
import root.poor.Poor;

public class MoneyPoor implements Runnable {

	private Poor p;
	
	private static final Logger logger = LogManager.getLogger(MoneyPoor.class);

	public MoneyPoor(Poor p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		logger.info("거지1시작됨");
		// TODO Auto-generated method stub
		
		while(true) {
			
			try {
				
				
//				System.out.println("거지1 : " + p.getMoney()+"원을 벌었습니다.");
				
				p.increase();
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.error("err !" + e);
			}
		}
		
		
	}
	
	
}
