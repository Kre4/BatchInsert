package ru.kre4.batches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kre4.batches.entity.DummyWithSeqEntity;

@Repository
public interface DummyWithSeqEntityRepository extends JpaRepository<DummyWithSeqEntity, Long> {

}
