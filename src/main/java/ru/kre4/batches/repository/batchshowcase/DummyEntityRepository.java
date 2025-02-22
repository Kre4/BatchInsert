package ru.kre4.batches.repository.batchshowcase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kre4.batches.entity.batchshowcase.DummyEntity;

@Repository
public interface DummyEntityRepository extends JpaRepository<DummyEntity, Long> {

}
