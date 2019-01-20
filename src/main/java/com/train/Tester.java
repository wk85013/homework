package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int totalticket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundtrip = scanner.nextInt();
        Ticket_ ticket = new Ticket_(totalticket, roundtrip);
        ticket.Calculation();


    }
}
