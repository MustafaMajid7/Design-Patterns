package DesginPatterns.iterator;

public class IndexedArrayIterator implements Iterator {

    private Object[] indexedarr;
    private int pos=0;

    public IndexedArrayIterator(Object[] indexedarr) {
        this.indexedarr = indexedarr;
    }

    public boolean hasNext(){
        if (pos <= indexedarr.length-1)
            return true ;
        else
            return false ;
    }

    public Object next(){
        if (pos <= indexedarr.length) {
            return indexedarr[pos++];
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public void setIterator(Object[] obj){
        indexedarr = obj;
    }

}

