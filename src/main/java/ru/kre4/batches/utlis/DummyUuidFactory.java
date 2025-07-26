package ru.kre4.batches.utlis;

import java.util.UUID;
import ru.kre4.batches.entity.DummyUuidEntity;

public class DummyUuidFactory extends DummyRandomAbstractFactory<DummyUuidEntity> {

    @Override
    public DummyUuidEntity createEntity() {
        DummyUuidEntity entity = new DummyUuidEntity();
        UUID seed = UUID.randomUUID();
        entity.setName(seed.toString());
        entity.setSomeInt(seed.hashCode());
        return entity;
    }
}
