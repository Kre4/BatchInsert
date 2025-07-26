package ru.kre4.batches.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kre4.batches.entity.DummyUuidEntity;

@Repository
public interface DummyUuidEntityRepository extends JpaRepository<DummyUuidEntity, UUID> {

}
