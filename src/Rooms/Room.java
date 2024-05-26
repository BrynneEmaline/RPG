package Rooms;

public class Room {

    protected String roomDescription;
    protected String roomName;


    public Room(String roomDescription, String roomName) {
        this.roomDescription = roomDescription;
        this.roomName = roomName;
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