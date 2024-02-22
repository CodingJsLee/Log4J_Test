package money.poor;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import poor.ui.InterfacePoor;

public class Poor {
	private int money = 0;
	private volatile boolean doubleIncrease = false;
	private static final Logger logger = LogManager.getLogger("poor");
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
    public void increase() {
    	
    	synchronized (this) {
    		if(!doubleIncrease) {
    			this.setMoney(money + 1);
//    			System.out.println("money : " + money);
//    			System.out.println("doubleIncrease : " + doubleIncrease);
    		} else {
    			this.setMoney(money + 5);
//    			System.out.println("money : " + money);
//    			System.out.println("doubleIncrease : " + doubleIncrease);
    		}
		}
    }
    
    public void doubleIncreaseSwitch(boolean doubleIncrease) {
    	this.doubleIncrease = doubleIncrease;
    	
    	if (doubleIncrease) {
            // 10초 후에 doubleIncrease 값을 다시 false로 변경
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Poor.this.doubleIncrease = false;
                    logger.info("두배 벌기 스킬이 종료됐습니다.");
                }
            }, 10000); // 10초(10000밀리초) 후에 실행
        }
    	
    }
	
	
}
