package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run[] th = new Thread_run[4];
		Thread_runnable[] th2 = new Thread_runnable[4];
		for(int i = 0; i < 4; i++) {   //thread_run���S����s
			th[i] = new Thread_run();
			th[i].start();
			try {
				th[i].join();          //thread_run�̎��s���I����Ă���main�����s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 4; i++) {   //thread_runnable���S����s
			th2[i] = new Thread_runnable();
			th2[i].run();
		}
		//th.start();
		//th2.run();
		for(int i = 0; i < 10; i++) {
			System.out.println("main����o�́@: "+i);
		}
	}

}