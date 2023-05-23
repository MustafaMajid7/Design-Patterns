package DesginPatterns.iterator;

public class UserDefinedQueue implements DataStructure{

    private Object[] arr = new Object[1000];;
    private int insertionPos = 0;
    private int deletionPos = 0;

    @Override
    public String insert(Object obj) {
        arr[++insertionPos] = obj;
        return "got inserted";
    }

    @Override
    public Object get() {
        if (insertionPos == 0)
            return null;
        else
            return arr[insertionPos];
    }

    @Override
    public Object pop() {
        if (insertionPos == 0)
            return null;
        else
            return arr[deletionPos++];
    }
    @Override
    public int size() {
        return arr.length;
    }
    @Override
    public Object getIter(int i) {
        if (i >= arr.length && i < 0)
            throw new ArrayIndexOutOfBoundsException("there is no more elements");
        else
            return arr[i];
    }
}
