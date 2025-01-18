package com.saloni.tbSystem;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;
    private String title;
    private LocalDateTime dateTime; // Matches DATETIME
    private String location;
    private Double price; // Matches DECIMAL(10, 2)
    private Integer seatsAvailable;
    private String description;
    private String eventType; // Matches VARCHAR(50)

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;
}
