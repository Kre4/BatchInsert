package ru.kre4.batches;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("default")
class NoSpecificSettingsTest extends InsertTest {

    /**
     * sequnce + 50
     *  14100 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     6176500 nanoseconds spent preparing 1020 JDBC statements;
     *     137330300 nanoseconds spent executing 1020 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     225296900 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */

    /**
     * uuid
     * 13300 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     1992374 nanoseconds spent preparing 1000 JDBC statements;
     *     117729824 nanoseconds spent executing 1000 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     161160800 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */

    /**
     * sequence + 1
     * 12800 nanoseconds spent acquiring 1 JDBC connections;
     *     0 nanoseconds spent releasing 0 JDBC connections;
     *     4467000 nanoseconds spent preparing 2000 JDBC statements;
     *     207938500 nanoseconds spent executing 2000 JDBC statements;
     *     0 nanoseconds spent executing 0 JDBC batches;
     *     0 nanoseconds spent performing 0 L2C puts;
     *     0 nanoseconds spent performing 0 L2C hits;
     *     0 nanoseconds spent performing 0 L2C misses;
     *     149340600 nanoseconds spent executing 1 flushes (flushing a total of 1000 entities and 0 collections);
     *     0 nanoseconds spent executing 0 pre-partial-flushes;
     *     0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
     */
}
