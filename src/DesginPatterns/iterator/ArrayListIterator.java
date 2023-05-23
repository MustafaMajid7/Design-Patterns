package DesginPatterns.iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

    private ArrayList<Object> arrls;
    private int pos=0;

    public ArrayListIterator(ArrayList<Object> arrls) {
        this.arrls = arrls;
    }

    public boolean hasNext(){
        if (pos <= arrls.size()-1)
            return true ;
        else
            return false ;
    }

    public Object next(){
        if (pos <= arrls.size()) {
            return arrls.get(pos++);
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

}
