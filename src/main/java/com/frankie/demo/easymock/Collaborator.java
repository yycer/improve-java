package com.frankie.demo.easymock;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 08:31
 */
public interface Collaborator {

    void documentAdded(String title);

    void documentChanged(String title);

    void documentRemoved(String title);

    byte voteForRemoval(String title);

    byte voteForRemovals(String... titles);
}
