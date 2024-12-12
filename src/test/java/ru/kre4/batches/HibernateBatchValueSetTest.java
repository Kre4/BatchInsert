package ru.kre4.batches;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("with-hiber-batch-setting")
class HibernateBatchValueSetTest extends InsertTest {

    /**
     * sequnce + 50
     *  12500 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     492900 nanoseconds spent preparing 21 JDBC statements;
     *     4889300 nanoseconds spent executing 20 JDBC statements;
     *     33261000 nanoseconds spent executing 20 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     89461700 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */

    /**
     * sequence + 1
     * 13900 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     5111800 nanoseconds spent preparing 1001 JDBC statements;
     *     100795300 nanoseconds spent executing 1000 JDBC statements;
     *     27782800 nanoseconds spent executing 20 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     40605600 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */
}
