package behavioral_patterns.command_pattern.traditional_approach;

import java.util.ArrayList;

public class House {
    ArrayList<Room> rooms;

    public House(){
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
