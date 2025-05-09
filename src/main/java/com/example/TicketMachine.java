package com.example;

public class TicketMachine {

    Ticket createTicket(String ticketType) {
        if(ticketType.equalsIgnoreCase("Bus")) {
            return new BusTicket();
        }
        return new TrainTicket();
    }


}
