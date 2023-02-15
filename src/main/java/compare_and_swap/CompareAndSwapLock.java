package compare_and_swap;

import java.util.concurrent.atomic.AtomicBoolean;

public class CompareAndSwapLock {

  private AtomicBoolean locked = new AtomicBoolean(false);

  public static void main(String[] args) {

    CompareAndSwapLock lock = new CompareAndSwapLock();

  }

  public void unlock() {
    this.locked.set(false);
  }

  public void lock() {
    while (!this.locked.compareAndSet(false, true)) {
      // busy wait - until compareAndSet() succeeds
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
