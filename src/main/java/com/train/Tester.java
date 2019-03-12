package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalticket = 0;
        int roundtrip = 0;
        do {
            System.out.print("Please enter number of tickets: ");
            totalticket = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            roundtrip = scanner.nextInt();
            if (totalticket != -1 && roundtrip != -1) {
                Ticket_ ticket = new Ticket_(totalticket, roundtrip);
                ticket.Calculation();
            }

        } while (totalticket != -1 && roundtrip != -1);
        System.out.print("Finish buy tickets");
    }
}
