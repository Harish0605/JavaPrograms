package ratan_java;


public class MyThread extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("user thread ");
		}
	}
	class ThreadDemo{
		public static void main(String[] args) {
			MyThread t = new MyThread();
			t.start();
			//logics of main thread
			for(int i=0;i<10;i++) {
				System.out.println("main Thread");
			}

		}	
	}
	

}
