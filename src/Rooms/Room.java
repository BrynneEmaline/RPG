package Rooms;

public class Room {

    protected String roomDescription;
    protected String roomName;
    protected String roomState;


    public Room(String roomDescription, String roomName, String roomState) {
        this.roomDescription = roomDescription;
        this.roomName = roomName;
        this.roomState = roomState;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;                 // this is so the subclass can re-set the room description based
                                                                // on changing game state
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }
}

//VARIABLES:
// name and description
// items in room
//public class Room {
   // public void enter(GameState gameState) {
        // Logic that checks the state
     //   if (gameState.hasItem(new Item("Lantern"))) {
      //      System.out.println("Your lantern illuminates the room brightly.");
     //   } else {
     //       System.out.println("It's too dark to see anything.");
     //   }
   // }
// }