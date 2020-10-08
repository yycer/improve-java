package com.frankie.demo.easymock;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yao Frankie
 * @date: 2020/10/8 08:31
 */
public class ClassTested {

    private Collaborator listener;
    private final Map<String, String> documents = new HashMap<>();

    public void setListener(Collaborator listener){
        this.listener = listener;
    }

    public void addDocument(String title, String content){
        boolean documentChange = documents.containsKey(title);
        documents.put(title, content);
        if (documentChange){
            notifyListenersDocumentChange(title);
        } else {
            notifyListenersDocumentAdd(title);
        }
    }

    public boolean removeDocument(String title){
        if (!documents.containsKey(title)){
            return true;
        }
        if (!listenersAllowRemoval(title)){
            return false;
        }
        documents.remove(title);
        notifyListenersDocumentRemoved(title);
        return true;
    }

    public boolean removeDocuments(String... titles){
        if (!listenersAllowRemovals(titles)){
            return false;
        }
        for (String t: titles){
            documents.remove(t);
            notifyListenersDocumentRemoved(t);
        }
        return true;
    }

    private boolean listenersAllowRemovals(String... titles) {
        return listener.voteForRemovals(titles) > 0;
    }

    private void notifyListenersDocumentRemoved(String title) {
        listener.documentRemoved(title);
    }

    private boolean listenersAllowRemoval(String title) {
        return listener.voteForRemoval(title) > 0;
    }

    private void notifyListenersDocumentAdd(String title) {
        listener.documentAdded(title);
    }

    private void notifyListenersDocumentChange(String title) {
        listener.documentChanged(title);
    }
}
