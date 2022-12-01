package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnumTest {

    @Test
    public void getEnclosingClassReturnsEnumClass() {
        assertEquals(TestEnum.class, TestEnum.ONE.getClass().getEnclosingClass());
    }
}