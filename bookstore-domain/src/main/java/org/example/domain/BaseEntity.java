package org.example.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@EqualsAndHashCode(of = "id")
@Getter
public class BaseEntity implements Serializable {

    @Id
    private UUID id;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date modifiedAt;


    @Setter
    private boolean deleted;

    @Version
    private Integer version;
}
