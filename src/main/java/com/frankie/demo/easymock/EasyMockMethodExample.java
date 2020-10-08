package com.frankie.demo.easymock;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.easymock.EasyMock.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 09:41
 */
public class EasyMockMethodExample {

    @Test
    public void test(){
        ArrayList<Integer> mockList = mock(ArrayList.class);
        expect(mockList.add(10)).andReturn(true);
        expect(mockList.add(20)).andReturn(true);
        expect(mockList.size()).andReturn(2);
        expect(mockList.get(0)).andReturn(10);
        replay(mockList);

        mockList.add(10);
        mockList.add(20);
        Assert.assertTrue(mockList.get(0) == 10);
        Assert.assertEquals(mockList.size(), 2);

    }
}
