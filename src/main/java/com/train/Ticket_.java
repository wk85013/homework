package com.train;

public class Ticket_ {
    private static int price = 1000;
    private static float discount = 0.9f;
    private int totalticket;
    private int roundtrip;

    public Ticket_(int totalTicket, int roundTrip) {
        this.totalticket = totalTicket;
        this.roundtrip = roundTrip;

    }

    public void Calculation() {
        int totalPrice;
        if (totalticket < roundtrip) {
            System.out.println("TotalTicket may higher than roundtrip");
        } else {
            totalPrice = (int) ((totalticket - roundtrip) * price + roundtrip * price * 2 * discount);
            System.out.println("Total tickets:" + totalticket);
            System.out.println("Round-trip:" + roundtrip);
            System.out.println("Total: " + totalPrice);
        }

    }
}
