package ru.kre4.batches.utlis;

import ru.kre4.batches.entity.DummyWithSeqEntity;

import java.util.UUID;

public class DummyWithSeqFactory extends DummyRandomAbstractFactory<DummyWithSeqEntity> {

    @Override
    public DummyWithSeqEntity createEntity() {
        DummyWithSeqEntity entity = new DummyWithSeqEntity();
        UUID seed = UUID.randomUUID();
        entity.setName(seed.toString());
        entity.setSomeInt(seed.hashCode());
        return entity;
    }
}
