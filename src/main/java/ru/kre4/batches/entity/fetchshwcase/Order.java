package ru.kre4.batches.entity.fetchshwcase;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
}
