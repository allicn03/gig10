package org.perscholas.gig10.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    BigDecimal budget;
    String name;
    Date startDate;
    Date EndDate;
    @ManyToOne
    Group group;
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy = "category")
    Set<Transaction> transactions = new TreeSet<>();
}
