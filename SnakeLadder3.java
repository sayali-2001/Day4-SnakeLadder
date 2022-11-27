package SnakeLadder;

import java.util.Random;

public class SnakeLadder3 {
    public static void main(String[] args) {
        int StartPos = 0;
        int Ladder = 1;
        int Snake = 2;
        int player_position=0;
        System.out.println("Game Starts Now");
        System.out.println("Starting position of player is: "+StartPos);
        Random rd = new Random();
        int diceroll = rd.nextInt(7);
//        System.out.println(diceroll);
        System.out.println("Player gets Dice Number: " +diceroll);

        int n = rd.nextInt(3);
        System.out.println("..."+n);
        switch(n){
            case 0:
                System.out.println("No Play");
                break;
            case 1:
                player_position = player_position + diceroll;
                System.out.println("Ladder : " +player_position);
                break;
            case 2:
                player_position = player_position - diceroll;
                System.out.println("Snake : " +player_position);
                break;
        }
    }
}
