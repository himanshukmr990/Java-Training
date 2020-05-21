package runnable_test;

public class RunnableLambda {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 4; i++) {
					System.out.println("From Thread 1 [" + Thread.currentThread().getName() + " ] " + i);
				}
			}
		};

		new Thread(runnable, "my thread").start();

/** Runnable using Lambda **/
		
		Runnable runnable2 = () -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("From Thread 2[" + Thread.currentThread().getName() + " ] " + i);
			}
		};
		new Thread(runnable2, "my thread").start();

	}
}
