package DesginPatterns.iterator;

public interface DataStructure {

    String insert(Object obj);
    Object get();
    Object pop();
    int size();
    Object getIter(int i);
}
