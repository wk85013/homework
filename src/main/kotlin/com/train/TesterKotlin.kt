package com.train

import java.util.*

fun main(args: Array<String>) {
    var scanner: Scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundtrip = scanner.nextInt()

    var ticket: Ticket = Ticket(totalTicket = tickets, roundTrip = roundtrip)
    ticket.Calculation()


}


class Ticket(var totalTicket: Int, var roundTrip: Int) {
    val price: Int = 1000;
    val discount: Float = 0.9f;
    fun Calculation() {
        val totalPrice: Int
        if (totalTicket < roundTrip) {
            println("TotalTicket may higher than roundtrip")
        } else {
            totalPrice =
                    ((totalTicket - roundTrip) * price + roundTrip.toFloat() * price.toFloat() * 2f * discount).toInt()
            println("Total tickets:$totalTicket")
            println("Round-trip:$roundTrip")
            println("Total: $totalPrice")
        }


    }


}