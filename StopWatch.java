
package threads;


public class StopWatch extends Thread{

    public void​ start(){
        int hours =0;
        int minutes = 0;
        int seconds = 0;
        while​(true){
            try​{
            // Sleep the main thread for a second
            Thread.sleep(100);
            // Increment the seconds
            seconds ++;

            if (seconds == 60){
            // Increment the minutes
                minutes++;
                seconds = 0;
            }
            if (minutes == 60){
            // Increment the hours
                hours++;
                minutes = 0;
            }

            System.out.println(hours + ":" + minutes + ":" + seconds);
            } catch​(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    

