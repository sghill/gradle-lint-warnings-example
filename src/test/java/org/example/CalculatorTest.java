package org.example;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldAdd() {
        Calculator calc = new Calculator();
        int actual = calc.add(4, 10);
        assertThat(actual, is(14));
    }
}
