package com.blz.gambling;

public class Gambler {
    public static void main(String[] args) {
        int stake = 100;
        int goal = 200;
        int bet = 1;
        int days = 0;
       for (int i = 0; i < 100 && stake < goal; i++);
            days++;
            stake = stake - bet;
            boolean win = Math.random() < 0.5;
            if (win) {
                stake = stake + bet;
            }
        System.out.println("Days taken to reach goal: " + days);
        System.out.println("Ending stake: " + stake);

    }

    }