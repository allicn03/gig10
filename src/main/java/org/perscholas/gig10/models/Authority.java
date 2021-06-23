package org.perscholas.gig10.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Authority implements GrantedAuthority {
    private static final long serialVersionUID = 7387814812236128364L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String authority;
    @ManyToOne
    User user;
}
