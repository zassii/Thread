package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run[] th = new Thread_run[4];
		Thread_runnable[] th2 = new Thread_runnable[4];
		for(int i = 0; i < 4; i++) {   //thread_runを４回実行
			th[i] = new Thread_run();
			th[i].start();
			try {
				th[i].join();          //thread_runの実行が終わってからmainを実行
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 4; i++) {   //thread_runnableを４回実行
			th2[i] = new Thread_runnable();
			th2[i].run();
		}
		//th.start();
		//th2.run();
		for(int i = 0; i < 10; i++) {
			System.out.println("mainから出力　: "+i);
		}
	}

}