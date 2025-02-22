package ru.kre4.batches.entity.fetchshwcase;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {

    @Id
    private Integer id;

    private String nickname;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
    private Set<Order> orders;
}
