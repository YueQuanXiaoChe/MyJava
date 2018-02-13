/**
 * 定时器（最原始简化的定时调度，企业级应用中这个不好使）
 */
package javaClassLib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("当前时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
	}
	
}

public class TimerDemo {

	public static void main(String[] args) {
		Timer timer = new Timer();
		// 单位是毫秒,1秒后开始执行，而后每2秒执行一次
		timer.schedule(new MyTask(), 1000, 2000);
	}

}
