package com.example.eventticketingsystem.repository;

import com.example.eventticketingsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
