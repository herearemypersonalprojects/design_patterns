package effective;

import java.util.concurrent.TimeUnit;

public class StopThread {
	private static boolean stopRequested;
	
	private static synchronized void requestStop() {
		stopRequested = true;
		System.out.println("request stop");
	}
	
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (!stopRequested) {
					i++;
					//System.out.println(stopRequested);
				}
			}
		});
		t.start();
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}

}
