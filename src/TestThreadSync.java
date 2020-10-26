
public class TestThreadSync {

	private int bal = 0;

	public void test1() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					add();
				}

			}

		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					sub();
				}

			}

		});
		
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Balance is" + bal);
	}

	public  void add() {
		bal++;
	}

	public synchronized void sub() {
		bal--;
	}

	public static void main(String ar[]) throws InterruptedException {
		TestThreadSync ts = new TestThreadSync();
		ts.test1();
	}

}
