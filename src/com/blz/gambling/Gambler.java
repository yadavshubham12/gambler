package com.blz.gambling;

public class Gambler {
    public static void main(String[] args) {
        int stake = 100;
        int bet = 1;
        int totalWon = 0;
        int totalLoss = 0;
        int dayswon = 0;
        int daysloss = 0;
        int won = 0;
        int loss = 0;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 100; j++) {
                stake = stake - bet;
                boolean win = Math.random() < 0.5;
                if (win) {
                    stake = stake + bet;
                    won = won + bet;
                } else {
                    loss = loss + bet;
                }
                if (won > loss) {
                    dayswon++;
                    totalWon += won;
                } else {
                    daysloss++;
                    totalLoss += loss;
                }
            }
                stake = 100;

            }
            System.out.println("Days Won " + dayswon);
            System.out.println("Days Loss " + daysloss);
            System.out.println(" Total amount won: $ " + totalWon);
            System.out.println(" Total amount Loss: $ " + totalLoss);
        }

    }
