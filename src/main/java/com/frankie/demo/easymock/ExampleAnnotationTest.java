package com.frankie.demo.easymock;


import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 08:39
 */
@RunWith(EasyMockRunner.class)
public class ExampleAnnotationTest {

    @Mock
    private Collaborator mock;

    @TestSubject
    private ClassTested classTested;

    @Test
    public void testRemoveNonExistingDocument(){
        replay(mock);
//        classTested.addDocument("Does not exist", "1");
        classTested.removeDocument("Does not exist");
    }

}
