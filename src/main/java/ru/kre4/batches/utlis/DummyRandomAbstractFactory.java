package ru.kre4.batches.utlis;

import java.util.List;
import java.util.stream.IntStream;

public abstract class DummyRandomAbstractFactory<T> {

    public abstract T createEntity();

    public List<T> createEntityList(int n) {
        return IntStream.range(0, n).mapToObj(i -> this.createEntity()).toList();
    }
}
