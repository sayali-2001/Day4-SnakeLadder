package SnakeLadder;

import java.util.Random;

public class SnakeLadder2 {
    public static void main(String[] args) {
        int StartPos = 0;
        System.out.println("Game Starts Now");
        System.out.println("Starting position of player is: "+StartPos);
        Random rd = new Random();
        int diceroll = rd.nextInt(7);
        System.out.println("Player gets Dice Number: " +diceroll);
    }
}
