package org.example.domain.book;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "books")
@Getter
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "books_authors", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Author> authors;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

    private int stock;

    private int sellCount;

    private double sellPrice;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();

    public void addReview(Review review){
        reviews.add(review);
    }
}
