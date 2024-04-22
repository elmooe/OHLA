package testit;

import ohjelma.TimeUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "3665, '1:01:05'",
            "59, '0:00:59'",
            "60, '0:01:00'",
            "3600, '1:00:00'",
            "31999, '8:53:19'",
            "32000, '-1'",
            "-1, '-1'"
    })
    public void testSecToTime(int seconds, String expectedTime) {
        assertEquals(expectedTime, TimeUtils.secToTime(seconds));
    }
}

