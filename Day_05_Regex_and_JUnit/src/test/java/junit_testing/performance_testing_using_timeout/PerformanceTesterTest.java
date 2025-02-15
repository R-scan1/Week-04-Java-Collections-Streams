package junit_testing.performance_testing_using_timeout;


import static org.junit.jupiter.api.Assertions.*;

import junit.performance_testing_using_timeout.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if method takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        PerformanceTester.longRunningTask();
    }
}
