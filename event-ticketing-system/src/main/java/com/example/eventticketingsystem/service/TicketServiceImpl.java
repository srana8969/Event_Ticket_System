package com.example.eventticketingsystem.service;

import com.example.eventticketingsystem.model.Ticket;
import com.example.eventticketingsystem.repository.TicketRepository;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;

@Service
public class TicketServiceImpl implements TicketService{
  @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket generateTicket(Ticket ticket) {
        Ticket savedTicket = ticketRepository.save(ticket);

        // Generate QR code for this ticket;
        genrateQRCode(savedTicket);
        return savedTicket;
    }

    @Override
    public void genrateQRCode(Ticket ticket) {

    }
}
