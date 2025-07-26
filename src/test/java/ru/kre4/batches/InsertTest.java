package ru.kre4.batches;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;
import ru.kre4.batches.entity.DummyEntity;
import ru.kre4.batches.entity.DummyUuidEntity;
import ru.kre4.batches.entity.DummyWithSeqEntity;
import ru.kre4.batches.repository.DummyEntityRepository;
import ru.kre4.batches.repository.DummyUuidEntityRepository;
import ru.kre4.batches.repository.DummyWithSeqEntityRepository;
import ru.kre4.batches.utlis.DummyFactory;
import ru.kre4.batches.utlis.DummyUuidFactory;

import java.util.List;
import ru.kre4.batches.utlis.DummyWithSeqFactory;

@SpringBootTest(properties = {"spring.cache.type=NONE"})
@Sql(scripts = {"classpath:clean.sql"})
@Transactional
public abstract class InsertTest {

    @Autowired
    DummyEntityRepository dummyEntityRepository;

    @Autowired
    DummyWithSeqEntityRepository dummyWithSeqEntityRepository;
    @Autowired
    private DummyUuidEntityRepository dummyUuidEntityRepository;

    @Test
    void testSaveAllThousandDummyEntity() {
        DummyFactory factory = new DummyFactory();
        List<DummyEntity> generatedList = factory.createEntityList(1000);
        dummyEntityRepository.saveAll(generatedList);
        dummyEntityRepository.flush();
    }

    @Test
    void testSaveAllThousandDummyWithSeqEntity() {
        DummyWithSeqFactory factory = new DummyWithSeqFactory();
        List<DummyWithSeqEntity> generatedList = factory.createEntityList(1000);
        dummyWithSeqEntityRepository.saveAll(generatedList);
        dummyWithSeqEntityRepository.flush();
    }

    @Test
    void testSaveAllThousandDummyUuidEntity() {
        DummyUuidFactory factory = new DummyUuidFactory();
        List<DummyUuidEntity> generatedList = factory.createEntityList(1000);
        dummyUuidEntityRepository.saveAll(generatedList);
        dummyWithSeqEntityRepository.flush();
    }

}
