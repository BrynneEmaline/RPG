package Rooms;

import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private List<Room> rooms = new ArrayList<>();

    public RoomManager() {
        rooms.add(new Room("Boss description", "Boss"));
        rooms.add(new Room("Lab description", "Lab"));
        rooms.add(new Room("Classroom description", "Classroom"));
        rooms.add(new Room("Cave description", "Cave"));
        rooms.add(new Room("Start description", "Start"));
        rooms.add(new Room("Alley description", "Alley"));
        rooms.add(new Room("Train description", "Train"));
        rooms.add(new Room("Harbor description", "Harbor"));
        rooms.add(new Room("Knoll description", "Knoll"));
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

}

/*
item class- a place to hold the functionality for items
-receive
-give to NPC
-show item to NPC for special dialog
-combine (later high level items)
 */

// Room Manager
// METHODS
// moving left and right
// get description  (actual descriptions held in individual rooms)
// *I should include NPCs in the room in the description*
// get name
// get choices menu







