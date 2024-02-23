package poor.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import money.poor.Poor;

public class InterfacePoor implements Runnable{
	
	private Poor p;
	
	public InterfacePoor(Poor p) {
		this.p = p;
	}

	@Override
	public void run() {
		Logger logger = LogManager.getLogger("poor");
		logger.info("거지인터페이스 시작됨");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("******************************************");
			System.out.println("1. 돈 두배, 2. 번 돈 확인, 3. 종료");
			System.out.println("******************************************");

			
			try {
				String inputNum = reader.readLine();
				
				if("1".equals(inputNum)) {
					p.doubleIncreaseSwitch(true);
					logger.debug("거지1님이 1을 눌렀습니다.");
				} else if("2".equals(inputNum)) {
					System.out.println("번돈 : " + p.getMoney());
					logger.info("거지1님이 2를 눌렀습니다.");
				} else if("3".equals(inputNum)) {
					logger.info("거지1님이 게임을 종료하였습니다.");
				} else {
					throw new IOException("강제로 발생한 IOException.");
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.error(e);
			}
		}
		
	}
}
