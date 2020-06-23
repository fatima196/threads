/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
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
