package com.example.eventticketingsystem.controller;

import com.example.eventticketingsystem.model.Ticket;
import com.example.eventticketingsystem.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketServiceImpl ticketService;
    @PostMapping("/generate")
    public ResponseEntity<String> generateTicket(@RequestBody Ticket ticket) {
        Ticket generatedTicket = ticketService.generateTicket(ticket);
        return ResponseEntity.ok("Ticket generated successfully. Ticket ID: " + generatedTicket.getId());
    }

}
