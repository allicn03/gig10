package org.perscholas.gig10.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name="user_id"),joinColumns = @JoinColumn(name="budget_id") )
    Set<User> users = new HashSet<>();
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "budget")
    Set<Group> groups = new TreeSet<>();

}
