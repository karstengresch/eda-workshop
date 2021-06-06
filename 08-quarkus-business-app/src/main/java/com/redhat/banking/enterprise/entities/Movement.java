package com.redhat.banking.enterprise.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "movements")
public class Movement extends PanacheEntityBase {

    public int account_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public Instant movement_date;
    public String description;
    public int quantity;

}
