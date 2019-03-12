package com.train

import java.util.*

fun main(args: Array<String>) {
    var scanner: Scanner = Scanner(System.`in`)
    var tickets = 0
    var roundtrip = 0
    do {
        print("Please enter number of tickets: ")
        tickets = scanner.nextInt()
        print("How many round-trip tickets: ")
        roundtrip = scanner.nextInt()
        //when練習
        when (tickets != -1 && roundtrip != -1) {
            true -> {
                val ticket: Ticket = Ticket(totalTicket = tickets, roundTrip = roundtrip)
                ticket.Calculation()
            }
            false -> println("Finish buy ticket")

        }

    } while (tickets != -1 && roundtrip != -1)


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