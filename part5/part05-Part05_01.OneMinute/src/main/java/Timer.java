/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
public class Timer {
    private int hundredthsOfSecond;
    private int seconds;
    
    public Timer() {
        this.hundredthsOfSecond = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundredthsOfSecond++;
        
        if(this.hundredthsOfSecond == 100) {
            this.hundredthsOfSecond*=0;
            this.seconds++;
            if(this.seconds == 60) {
                this.seconds*=0;
            }
        }
    }
    
    public String toString() {
        String time1 = String.format("%02d", this.seconds);
        String time2 = String.format("%02d", this.hundredthsOfSecond);
        return time1 + ":" + time2;
    }
}
