package com.banatech.gn.ambaguimoscou.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "Folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String residenceStatus;
    private String university;
    private String city;
    private String address;
    private String profession;
    private String job;
    private String company;
    //Family situation
    private String civilStatus;
    private  int nbChildren;
    //Reference to the country
    private String firstNameReferent;
    private String lastNameReferent;
    private String emailReferent;
    private String phoneReferent;
    private String familyConnection;
}
