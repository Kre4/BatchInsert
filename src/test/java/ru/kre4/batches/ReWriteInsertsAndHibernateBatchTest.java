package ru.kre4.batches;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("with-driver-and-hiber-batch-settings")
public class ReWriteInsertsAndHibernateBatchTest extends InsertTest {

    /**
     * sequnce + 50
     *  12800 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     786400 nanoseconds spent preparing 21 JDBC statements;
     *     4739500 nanoseconds spent executing 20 JDBC statements;
     *     13538500 nanoseconds spent executing 20 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     67218500 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */

    /**
     * uuid
     * 12799 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     66900 nanoseconds spent preparing 1 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC statements;
     *     12368501 nanoseconds spent executing 20 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     28332501 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */


    /**
     * sequence + 1
     * 12400 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     4879700 nanoseconds spent preparing 1001 JDBC statements;
     *     106241500 nanoseconds spent executing 1000 JDBC statements;
     *     9354600 nanoseconds spent executing 20 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     21632100 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */
}
