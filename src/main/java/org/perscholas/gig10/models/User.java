package org.perscholas.gig10.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name="users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    String password;
    @Transient
    String confirmPassword;
    @ToString.Exclude
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "users")
    Set<Budget> budgets = new TreeSet<>();
    @ToString.Exclude
    @OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy="user")
    Set<Authority> authorities = new HashSet<>();
//    @OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy="user")
//    Set<Profile> profiles = new TreeSet<>();

}
