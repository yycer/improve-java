package com.frankie.demo.mockito.l1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

/**
 * @author: Yao Frankie
 * @date: 2020/11/28 16:07
 */
@RunWith(MockitoJUnitRunner.class)
public class AccountLoginControllerTest {

    @InjectMocks
    private AccountLoginController controller;

    @Mock
    private AccountDao accountDao;

    @Mock
    private HttpServletRequest request;

    @Before
    public void setUp(){
        when(request.getParameter("username")).thenReturn("frankie");
        when(request.getParameter("password")).thenReturn("123456");
    }

    @Test
    public void testLoginSuccess(){
        when(accountDao.findAccount(anyString(), anyString())).thenReturn(new Account());
        String ans = controller.login(request);
        assertEquals(ans, "/index");
    }

    @Test
    public void testLoginFailed(){
        when(accountDao.findAccount(anyString(), anyString())).thenReturn(null);
        String ans = controller.login(request);
        assertEquals(ans, "/login");
    }

    @Test
    public void testLoginException(){
        when(accountDao.findAccount(anyString(), anyString())).thenThrow(new UnsupportedOperationException());
        String ans = controller.login(request);
        assertEquals(ans, "/505");
    }
}
