package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    MainHW mainHW;
    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }
    @Test
    void evenOddNumberTrueTest() {
        assertTrue(mainHW.evenOddNumber(10));
}

    @Test
    void evenOddNumberFalseTest() {
        assertFalse(mainHW.evenOddNumber(9));
}

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 100})
    void numberInIntervalTrueTest(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,24,101})
    void numberInIntervalFalseTest(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }
}