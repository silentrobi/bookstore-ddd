package org.example.dto;

import lombok.Data;
import org.example.common.BookType;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class BookDTO {

    private UUID id;

    private String name;

    private Set<UUID> authors;

    private BookType bookType;

    private int stock;

    private int sellCount;

    private double sellPrice;

    private List<ReviewDTO> reviews;
}
