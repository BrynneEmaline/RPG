package Rooms;

public class Player {
    private int currentPlayerIndex;
    private RoomManager roomManager;


    public Player(RoomManager roomManager) {
        this.currentPlayerIndex = 4;
        this.roomManager = roomManager;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void moveRight() {
        if (currentPlayerIndex < roomManager.getRooms().size() - 1) {
            currentPlayerIndex++;
        } else {
            System.out.println("There's nowhere else to go.. at least in that direction.");
        }
    }
    public void moveLeft() {
        if (currentPlayerIndex > 0) {
            currentPlayerIndex++;
        } else {
            System.out.println("There's nowhere else to go.. at least in that direction.");
        }
    }

}
