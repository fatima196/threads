
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class thread1 extends Thread{
    @Override
    public void run (){
        int count=0;
        while (count<=1000){
            System.out.println("Hello from thread 1");
            count++;
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
