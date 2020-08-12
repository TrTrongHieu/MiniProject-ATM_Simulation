package com.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    final static int FIVE_HUNDRED_THOUSAND = 500000;
    final static int TWO_HUNDRED_THOUSAND = 200000;
    final static int ONE_HUNDRED_THOUSAND = 100000;
    final static int FIFTY_THOUSAND = 50000;
    //final static int TWEENTY_THOUSAND = 20000;
    //final static int TEN_THOUSAND = 10000;

    static int fiveHundred = 0;
    static int twoHundred = 0;
    static int oneHundred = 0;
    static int fifty = 0;
    //static int tweenty = 0;
    //static int ten = 0;
    static DecimalFormat decimalFormat = new DecimalFormat("#,### VND");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        do {
            System.out.print("Input your's money: ");
            money = sc.nextInt();
            System.out.println(String.format("Your's money: " + decimalFormat.format(money)));
            if (money >= FIVE_HUNDRED_THOUSAND) {
                fiveHundred = money / FIVE_HUNDRED_THOUSAND;
                money = money % FIVE_HUNDRED_THOUSAND;

            }
            if (money >= TWO_HUNDRED_THOUSAND) {
                twoHundred = money / TWO_HUNDRED_THOUSAND;
                money = money % TWO_HUNDRED_THOUSAND;

            }
            if (money >= ONE_HUNDRED_THOUSAND) {
                oneHundred = money / ONE_HUNDRED_THOUSAND;
                money = money % ONE_HUNDRED_THOUSAND;

            }
            if (money >= FIFTY_THOUSAND) {
                fifty = money / FIFTY_THOUSAND;
                money = money % FIFTY_THOUSAND;

            }

        } while (money % 50000 != 0);

        System.out.println(String.format("%s: %d", decimalFormat.format(FIVE_HUNDRED_THOUSAND), fiveHundred));
        System.out.println(String.format("%s: %d", decimalFormat.format(TWO_HUNDRED_THOUSAND), twoHundred));
        System.out.println(String.format("%s: %d", decimalFormat.format(ONE_HUNDRED_THOUSAND), oneHundred));
        System.out.println(String.format("%s: %d", decimalFormat.format(FIFTY_THOUSAND), fifty));

    }
}
