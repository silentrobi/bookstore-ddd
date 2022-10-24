package org.example.domain.book;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "BOOK")
@Getter
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Author> author;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

    private int sellCount;
}
