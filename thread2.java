
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class thread2 extends Thread{
    public void run(){
        int count=0;
        while (count<=400){
            System.out.println("Hello from thread 2 ");
            count++;
        try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }
   
}
