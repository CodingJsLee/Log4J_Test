package poor.inf.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import root.poor.Poor;

public class Inf implements Runnable{
//	private static final Logger logger = LogManager.getLogger(Inf.class);


	
	private Poor p;
	
	public Inf(Poor p) {
		this.p = p;
	}

	@Override
	public void run() {
		Logger logger = LogManager.getRootLogger();
		logger.trace("Configuration File Defined To Be : "+System.getProperty("log4j.configurationFile"));
		logger.info("거지인터페이스 시작됨");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("******************************************");
			System.out.println("1. 스킬사용, 2. 현재 번 돈 확인하기, 3. 집으로 가기");
			System.out.println("******************************************");

			
			try {
				String inputNum = reader.readLine();
//				System.out.println("입력한 값 : " + inputNum);
				
				if("1".equals(inputNum)) {
					p.doubleIncreaseSwitch(true);
					logger.info("거지1님이 1을 눌렀습니다.");
				} else if("2".equals(inputNum)) {
					System.out.println("번돈 : " + p.getMoney());
					logger.info("거지1님이 2을 사용하였습니다.");
				} else if("3".equals(inputNum)) {
					
					logger.info("거지1님이 게임을 종료하였습니다.");
				} else {
					System.out.println("test");
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
