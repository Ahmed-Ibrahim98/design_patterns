package behavioral_patterns.command_pattern.command_approach;

public class Light {
    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void switchLights() {
        switchedOn = !switchedOn;
    }
}
