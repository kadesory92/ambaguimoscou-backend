package com.banatech.gn.ambaguimoscou.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor @RequiredArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    private Integer id;
    private Date date;
    private Date hour;
    private String personName;
    private String email;
    private String service;
    private String reason;
    private boolean status;
}
