/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author lenovo
 */
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
