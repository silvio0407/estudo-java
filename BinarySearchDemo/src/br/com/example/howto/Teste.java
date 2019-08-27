package br.com.example.howto;

public class Teste {

	static int i = 0;
	
	static Object ob = new Object();

	public static void main(String[] args) {

		new Thread(t1).start();
		new Thread(t2).start();
	}

	private static void countMe(String name) {
		i++;
		System.out.println("Current Counter is: " + i + ", updated by: " + name);
	}

	private static Runnable t1 = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized(ob) {
				for (int i = 0; i < 500; i++) {
					
						countMe("t1");
					}
					
				}
			} catch (Exception e) {
			}

		}
	};

	private static Runnable t2 = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized(ob) {
				for (int i = 0; i < 500; i++) {
					
						countMe("t2");
					}
				}
			} catch (Exception e) {
			}

		}
	};
}
