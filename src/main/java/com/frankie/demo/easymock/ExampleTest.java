package com.frankie.demo.easymock;


import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 08:39
 */
public class ExampleTest {

    private Collaborator mock;

    private ClassTested classTested;

    @Before
    public void setUp(){
        mock = mock(Collaborator.class);
        classTested = new ClassTested();
        classTested.setListener(mock);
    }

    @Test
    public void testRemoveNonExistingDocument(){
        replay(mock);
//        classTested.addDocument("Does not exist", "1");
        classTested.removeDocument("Does not exist");
    }

}
