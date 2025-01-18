package com.saloni.tbSystem;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}