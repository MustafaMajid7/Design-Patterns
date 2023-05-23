package DesginPatterns.command;

public final class Light implements Device{

    private String name;
    private boolean state = false;

    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String excute() {
        if (!state) {
            state = true;
            return "Light is On";
        }
        else
            state = false;
        return "Light is Off";
    }
}
