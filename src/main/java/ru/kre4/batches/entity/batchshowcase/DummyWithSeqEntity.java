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
@Table(name = "dummy_with_seq")
@Getter
@Setter
public class DummyWithSeqEntity {

    @Id
    @SequenceGenerator(
            name = "step_50_generator",
            sequenceName = "dummy_id_sequence",
            initialValue = 100
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "step_50_generator"
    )
    private Long id;

    private String name;

    private Integer someInt;
}
