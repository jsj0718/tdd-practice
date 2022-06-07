package me.jsj.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {

    @Test
    void testMultiplication() {
        //given
        Dollar five = new Dollar(5);

        //when
        five.times(2);

        //then
        Assertions.assertEquals(10, five.amount);
    }
}
