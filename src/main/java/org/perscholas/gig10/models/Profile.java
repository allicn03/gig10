package org.perscholas.gig10.models;

import javax.persistence.*;
import java.util.Date;


public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    Double taxRate;
    Double mileage;
    Date date;
//    @ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER, mappedBy="user")
//    User user;
}
