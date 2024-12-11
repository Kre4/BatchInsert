package ru.kre4.batches.utlis;

import ru.kre4.batches.entity.DummyEntity;

import java.util.UUID;

public class DummyFactory extends DummyRandomAbstractFactory<DummyEntity> {

    @Override
    public DummyEntity createEntity() {
        DummyEntity entity = new DummyEntity();
        UUID seed = UUID.randomUUID();
        entity.setName(seed.toString());
        entity.setSomeInt(seed.hashCode());
        return entity;
    }
}
