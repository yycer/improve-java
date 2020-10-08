package com.frankie.demo.easymock;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 11:19
 */
@RunWith(EasyMockRunner.class)
public class MathApplicationTest {

    @Mock
    private CalculatorService calcService;

    @TestSubject
    private MathApplication mathApp = new MathApplication();

    @Test
    public void testAdd(){
        EasyMock.expect(calcService.add(10.0, 20.0)).andReturn(30.0);
        EasyMock.expectLastCall().times(1);
        calcService.serviceUsed();
        EasyMock.replay(calcService);

        Assert.assertEquals(mathApp.add(10.0, 20.0), 30.0, 0);
        EasyMock.verify(calcService);
    }
}
