package com.groupawesome;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
        int count = 0;
        while(count < 5){
        for (int i = 0; i < 3; i++) {
            myFinch.setMove("F", 2, 100);
            myFinch.setTurn("L", 20, 100);
            myFinch.setMove("B", 2, 100);
            myFinch.setTurn("R", 20, 100);
        }
        
        myFinch.setTurn("L", 360, 100);
        count++;
    }
        myFinch.stopAll();
        myFinch.disconnect();
    }
}
