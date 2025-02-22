package ru.kre4.batches.entity.batchshowcase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dummy")
@Getter
@Setter
public class DummyEntity {

    @Id
    @SequenceGenerator(
            name = "default_generator",
            sequenceName = "dummy_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "default_generator"
    )
    private Long id;

    private String name;

    private Integer someInt;
}
