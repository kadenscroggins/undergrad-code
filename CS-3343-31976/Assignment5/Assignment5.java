public class Assignment5 {
	public static void main(String[] args) {
		Assignment5Thread a5t = new Assignment5Thread();
	}
}

class Assignment5Thread implements Runnable {
	Assignment5Thread() {
		run();
	}

	public void run() {
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println("Thread Created");
	}
}