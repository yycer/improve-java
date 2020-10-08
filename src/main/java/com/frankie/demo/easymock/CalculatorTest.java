package com.frankie.demo.easymock;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 09:54
 */
@RunWith(EasyMockRunner.class)
public class CalculatorTest {

    @Mock
    private Calculator mockCalculator;

    @TestSubject
    private MathUtils mathUtils = new MathUtils(mockCalculator);

    @Test
    public void test(){

        expect(mockCalculator.add(1, 1)).andReturn(2);
        expect(mockCalculator.multiply(10, 10)).andReturn(100);
        replay(mockCalculator);

        assertEquals(mathUtils.add(1, 1), 2);
        assertEquals(mathUtils.multiply(10, 10), 100);
    }
}
