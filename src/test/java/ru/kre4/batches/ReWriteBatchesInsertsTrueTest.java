package ru.kre4.batches;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("with-driver-params")
public class ReWriteBatchesInsertsTrueTest extends InsertTest {

    /**
     * sequnce + 50
     * 13300 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     6619700 nanoseconds spent preparing 1020 JDBC statements;
     *     143104900 nanoseconds spent executing 1020 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     234792500 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */

    /**
     * sequence + 1
     * 14100 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     4487200 nanoseconds spent preparing 2000 JDBC statements;
     *     212082000 nanoseconds spent executing 2000 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     150469000 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */
}
