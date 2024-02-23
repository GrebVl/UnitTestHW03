package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.coverage.SomeService;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }
    //HW 3.1
    @ParameterizedTest
    @ValueSource(ints = {72})
    void chekNumberEvenReturnTrue(int id){
        assertTrue(mainHW.evenOddNumber(id));
    }

    @ParameterizedTest
    @ValueSource(ints = {75})
    void chekNumberEvenReturnFalse(int id){
        assertFalse(mainHW.evenOddNumber(id));
    }

    //HW 3.2
    @ParameterizedTest
    @ValueSource(ints = {25, 72, 100})
    void chekNumberInIntervalReturnTrue(int id){
        assertTrue(mainHW.numberInInterval(id));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, -15, 750})
    void chekNumberInIntervalReturnFalse(int id){
        assertFalse(mainHW.numberInInterval(id));
    }

}
