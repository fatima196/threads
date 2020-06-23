
package threads;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;


public class ThreadsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        t1.interrupt();
        thread2 t2=new thread2();
        t2.start();
        
       // t2.setPriority(MAX_PRIORITY);
       // t1.setPriority(MIN_PRIORITY);
      // StopWatch s=new StopWatch();
       //s.start();
    }
    
}
