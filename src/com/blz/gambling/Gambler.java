package com.blz.gambling;

public class Gambler {
    public static void main(String[] args) {
        int stake = 100;
        int bet = 1;
        int days = 0;
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < 100; i++) {
            int originalStake = stake;
            stake = stake - bet;
            boolean win = Math.random() < 0.5;
            if (win) {
                stake = stake + bet;
                wins++;
            } else {
                losses++;
            }
            if (stake <= originalStake / 2) {
                break;
            }
        }
        System.out.println("Resign for the day " + stake);
            System.out.println(" Wins " + wins);
            System.out.println(" Losses " + losses);
        }
    }