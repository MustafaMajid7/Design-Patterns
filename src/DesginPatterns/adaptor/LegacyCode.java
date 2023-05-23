package DesginPatterns.adaptor;

public class LegacyCode {

    public static int multiply(int num,int bynum){
        return num << bynum;
    }

    public static int divide(int num, int bynum){
        return num >> bynum;
    }
}
