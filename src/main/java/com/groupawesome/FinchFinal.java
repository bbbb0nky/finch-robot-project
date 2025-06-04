package com.groupawesome;

import com.birdbrain.Finch;

/**
 * create a finch final class
 */

public class FinchFinal {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
        int count = 0;
        while(count < 5) //while loop allows for the whole "dance" to repeat
        for (int i = 0; i < 3; i++) { //for loop allows for the movements to be repeated until the end of the chorus
            myFinch.setMove("F", 2, 100); //has finch move forward
            myFinch.setTurn("L", 20, 100); //has finch turn left
            myFinch.setMove("B", 2, 100); //has finch move backward
            myFinch.setTurn("R", 20, 100); //has finch turn right
        }
        
        myFinch.setTurn("L", 360, 100); //has finsh turn 360 degrees
        count++; //increment count
    }
        myFinch.stopAll();
        myFinch.disconnect();
    }
}
