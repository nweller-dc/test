import java.util.concurrent.locks.ReentrantLock;

public class test {
	ReentrantLock lock = new ReentrantLock();
	public void tryLock() { lock.tryLock(); }
	public ReentrantLock getLock() { return lock; }
}
//46
