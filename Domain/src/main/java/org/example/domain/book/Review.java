package org.example.domain.book;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;
import org.example.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
@Getter
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseEntity {

    private int rating;

    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;
}
