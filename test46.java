import java.util.concurrent.locks.ReentrantLock;

public class test {
	public static void main(String [] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.tryLock();
	}
}
//46
