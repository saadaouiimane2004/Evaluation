package com.evaluation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionEvaluationTest {

    @Test
    void ChainVide() {
        assertEquals("0",ExpressionEvaluate.evaluate (""));

    }


}
