package com.frankie.demo.easymock;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 10:50
 */
public class UtilsTestUsingRules {

    @Mock
    private IntegerUtils mockIU;

    @Mock
    private StringUtils  mockSU;

    @TestSubject
    private MyUtils mu = new MyUtils(mockIU, mockSU);

    @Rule
    public EasyMockRule easyMockRule = new EasyMockRule(this);

    @Test
    public void test(){
        expect(mockIU.add(10, 10)).andReturn(20);
        expect(mockSU.convert(10)).andReturn("10");
        expect(mockSU.reverse("CAT")).andReturn("TAC");
        replay(mockIU, mockSU);

        assertEquals(mu.add(10, 10), 20);
        assertEquals(mu.convert(10), "10");
        assertEquals(mu.reverse("CAT"), "TAC");
    }
}
