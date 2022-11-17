package Lecture9;

class SharedBoard2 {
	private int sum = 0;

	/* synchronized */ public void add() {
		int n = sum;
		Thread.yield();
		n += 1;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ": " + sum);
	}

	public int getSum() {
		return sum;
	}
}

class StudentThread2 extends Thread {

	private SharedBoard2 board;

	public StudentThread2(String name, SharedBoard2 board) {
		super(name);
		this.board = board;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++)
			board.add();
	}
}

public class SynchronizedEx2 {

	public static void main(String[] args) {

		SharedBoard2 board = new SharedBoard2();

		Thread th1 = new StudentThread2("sungkong", board);
		Thread th2 = new StudentThread2("hoebook", board);

		th1.start();
		th2.start();

	}

}