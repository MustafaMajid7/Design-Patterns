package DesginPatterns.iterator;

public class IteratorDefintion implements Iterator {

    private DataStructure DS;
    private int pos=1;

    public IteratorDefintion(DataStructure DS) {
        this.DS = DS ;
    }

    @Override
    public boolean hasNext() {
        return (pos < DS.size()) ? true : false;
    }

    @Override
    public Object next() {
        if(pos < DS.size())
            return DS.getIter(pos++);
        else
            throw new ArrayIndexOutOfBoundsException("there is no more elements");
    }
}
