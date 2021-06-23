package org.perscholas.gig10.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;
    String password;
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "users")
    Set<Budget> budgets = new TreeSet<>();
    @OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy="user")
    Set<Authority> authorities = new HashSet<>();

}
