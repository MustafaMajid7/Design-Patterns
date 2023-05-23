package DesginPatterns.adaptor;

public class Adaptor implements TargetBusiness{

    @Override
    public int multiplyByTwo(int num) {
        return LegacyCode.multiply(num,1);
    }

    @Override
    public int divideByTwo(int num) {
        return LegacyCode.divide(num,1);
    }
}
