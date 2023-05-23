package DesginPatterns.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {
    
    private Character [] name={'m','o','s','k','e'};
    private List<Character> l =Arrays.asList(name);

    private static Singleton s ;

    public static Singleton getSingleton(){
        if (s ==null)
            s = new Singleton();
        return s;

    }
    private Singleton() {
    }

    public List<Character> shuff(){
        Collections.shuffle(l);
        return l;
    }

}
