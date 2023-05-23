package DesginPatterns.iterator;


public class UserDefinedStack implements DataStructure{

    private Object[] arr = new Object[1000];
    private int pos=0;

    @Override
    public String insert(Object obj) {
        arr[pos++] = obj;
        return "got inserted";
    }

    @Override
    public Object get() {
        if (pos == 0)
            return null;
        else
            return arr[pos];
    }

    @Override
    public Object pop() {
        if (pos == 0)
            return null;
        else
            return arr[pos--];
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
