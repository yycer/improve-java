package com.frankie.demo.easymock;

import org.junit.Test;

import static org.easymock.EasyMock.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 11:03
 */
public class ExceptionTest {

    @Test
    public void test(){
        MyStringUtils mock = mock(MyStringUtils.class);
        expect(mock.toUpperCase(null))
                .andThrow(new IllegalArgumentException("NULL is not a valid argument"));
        replay(mock);

//        IllegalArgumentException exception = assertThrows(
//                IllegalArgumentException.class, () -> mock.toUpperCase(null));
//        assertEquals("NULL is not a valid argument", exception.getMessage());
        verify(mock);
    }
}
