package com.banatech.gn.ambaguimoscou.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
@Entity
@Getter
@Setter
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String object;
    private String description;
    private String letter;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_request_id", nullable = false)
    private User userRequest;
    @CreatedDate
    private OffsetDateTime dateCreated;
    @LastModifiedDate
    private OffsetDateTime lastUpdated;
}
