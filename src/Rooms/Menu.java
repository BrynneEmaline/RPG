package Rooms;
import java.util.Scanner;

public class Menu {
    private RoomManager roomManager = new RoomManager();
    private Player player = new Player(roomManager);
    private Scanner scanner = new Scanner(System.in);
    private int playerChoice;

    public void displayMenu() {
        switch (player.getCurrentPlayerIndex()) {
            case 1:
                System.out.println("Menu for Boss Room");
                break;
            case 2:

        }
    }
}
 /*
public class Menu {
     access the currentRoomIndex, and display a menu that corresponds with the room
     -load initial description-
1. examine location
    2. remember
    3. go right
    4. go left
} */
