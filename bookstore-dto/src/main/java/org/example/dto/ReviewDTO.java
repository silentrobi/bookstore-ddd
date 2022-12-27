package org.example.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ReviewDTO {

    private UUID id;

    private int rating;

    private String comment;

    private UserDTO user;
}
