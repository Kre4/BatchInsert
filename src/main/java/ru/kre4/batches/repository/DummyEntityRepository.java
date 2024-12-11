package ru.kre4.batches.repository;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kre4.batches.entity.DummyEntity;

@Repository
public interface DummyEntityRepository extends JpaRepository<DummyEntity, Long> {

}
