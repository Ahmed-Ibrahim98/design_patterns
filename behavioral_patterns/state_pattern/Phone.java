package behavioral_patterns.state_pattern;

public class Phone {
    private State state;

    public Phone(){
        state = new OffState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public String lock(){
        return "Locking Phone and Turning off Screen";
    }

    public String home(){
        return "Going to Home Screen";
    }

    public String unlock(){
        return "Unlocking the Phone to Home";
    }

    public String turnOn(){
        return "Turning Screen on, Device Still Locked";
    }
}
