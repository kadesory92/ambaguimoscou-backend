package com.banatech.gn.ambaguimoscou.domain;

import com.banatech.gn.ambaguimoscou.model.RoleName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(value = EnumType.STRING)
    private RoleName roleName;
    private String description;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
