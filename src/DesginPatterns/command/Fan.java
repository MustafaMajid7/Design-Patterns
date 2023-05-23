package DesginPatterns.command;

public final class Fan implements Device{

    private String name;
    private Integer state = 0;

    public Fan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String excute() {
        if (++state%4 > 0)
            return "Fan is On speed : " + state;
        else {
            state++;
            return "Fan is Off";
        }
    }
}
