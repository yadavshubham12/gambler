package com.blz.gambling;

public class Gambler {
    public static void main(String[] args) {
        int stake = 100;
        int days = 20;
        int bet = 1;
        int totalWon = 0;
        int totalLoss = 0;
        int won = 0;
        int loss = 0;

        for (int i = 0; i < 20; i++) {
            days++;
          for (int j = 0; j < 100; j++){
              stake = stake - bet;
                boolean win = Math.random() < 0.5;
                if (win) {
                    stake = stake + bet;
                    won = won + bet;
                    totalWon = totalWon + won;
                } else {
                    loss = loss + bet;
                    totalLoss = totalLoss + loss;
                }
                    stake = 100;
                }
            }
        System.out.println("Total days played " + days);
        System.out.println(" Total amount won " + totalWon);
        System.out.println(" Total amount Loss " + totalLoss);
        }

    }
