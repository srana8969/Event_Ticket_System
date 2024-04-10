package com.example.eventticketingsystem.service;

import com.example.eventticketingsystem.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
     Ticket generateTicket(Ticket ticket);
     void genrateQRCode(Ticket ticket);
}
