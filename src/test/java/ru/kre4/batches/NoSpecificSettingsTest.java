package ru.kre4.batches;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import ru.kre4.batches.entity.DummyEntity;
import ru.kre4.batches.entity.DummyWithSeqEntity;
import ru.kre4.batches.repository.DummyEntityRepository;
import ru.kre4.batches.repository.DummyWithSeqEntityRepository;
import ru.kre4.batches.utlis.DummyFactory;
import ru.kre4.batches.utlis.DummyWithSeqFactory;

import java.util.List;

@ActiveProfiles("default")
@SpringBootTest(properties = {"spring.cache.type=NONE"})
@Sql(scripts = {"classpath:clean.sql"})
class NoSpecificSettingsTest {

    @Autowired
    DummyEntityRepository dummyEntityRepository;

    @Autowired
    DummyWithSeqEntityRepository dummyWithSeqEntityRepository;

    /**
     * 1000 select
     *         nextval('dummy_id_seq') generated, the same inserts number. Inserting one by one.
     */
    @Test
    void testSaveThousandDummyEntity() {
        DummyFactory factory = new DummyFactory();
        List<DummyEntity> generatedList = factory.createEntityList(1000);
        generatedList.forEach(dummyEntity -> dummyEntityRepository.save(dummyEntity));
    }

    @Test
    void testSaveThousandDummyWithSeqEntity() {
        DummyWithSeqFactory factory = new DummyWithSeqFactory();
        List<DummyWithSeqEntity> generatedList = factory.createEntityList(1000);
        generatedList.forEach(dummyEntity -> dummyWithSeqEntityRepository.save(dummyEntity));
    }
}
